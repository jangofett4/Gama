#!/bin/sh
java -jar ~/bin/antlr-4.8-complete.jar -Dlanguage=CSharp Gama.g4 -visitor -listener
