@echo off
java -jar "C:\ANTLR\antlr-4.8-complete.jar" -Dlanguage=CSharp GamaPreprocessor.g4 -visitor -listener