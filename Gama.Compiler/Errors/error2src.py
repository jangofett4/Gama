file = open("Errors.txt")
lines = file.readlines()
file.close()

output = ""
type = ""
namespace = ""
context = ""
rest = ""
codemode = False
includes = []
errors = []

for line in lines:
	line = line.strip()
	if line.startswith("#") or line == "":
		continue
	if line.startswith("Output"):
		output = line.split()[1]
		continue
	if line.startswith("Namespace"):
		namespace = line.split()[1]
		continue
	if line.startswith("Type"):
		type = line.split()[1]
		continue
	if line.startswith("Includes"):
		split = line.split()
		split.pop(0)
		includes = split
		continue
	if line.startswith("Context"):
		context = line.split()[1]
		continue
	if line.startswith("Code"):
		codemode = True
		continue
	if codemode:
		rest += line
		continue
	split = line.split(maxsplit = 2)
	errors.append((int(split[0]), split[1], split[2].strip('"')))

if type == "" or namespace == "":
	print("Type and Namespace parameters need to be defined in errors file.")
	exit()
if type == "Multi":
	print("Writing errors to seperate files under {} namespace...")
	for error in errors:
		file = open("{}.cs".format(error[1]), "w")
		for include in includes:
			file.write("using {};\n".format(include))
		file.write("""
namespace {}
{{
""".format(namespace))
		file.write("""\tpublic class Error{err} : GamaError
	{{
		public Error{err}({ctx} ctx) : base("{msg}", ctx, ctx.GetText())
		{{
			{code}
		}}
	}}
""".format(err = error[1], ctx = context, msg = error[2], code = rest))
		file.write("}")
		file.close()
else:
	if output == "":
		print("Output parameter needs to be defined for single type targets")
		exit()

	print("Writing errors to same file under {} namespace into file {}...".format(namespace, output))
	file = open(output, "w")
	for include in includes:
		file.write("using {};\n".format(include))
	file.write("""
namespace {}
{{
""".format(namespace))
	for error in errors:
		# public class ErrorTypeNotFound : GamaError
		file.write("""\tpublic class Error{err} : GamaError
	{{
		public Error{err}({ctx} ctx) : base("{msg}", ctx, ctx.GetText())
		{{
			{code}
		}}
	}}
""".format(err = error[1], ctx = context, msg = error[2], code = rest))
	file.write("}")
	file.close()