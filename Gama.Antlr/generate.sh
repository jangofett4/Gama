#!/bin/sh
# Assumes you have a 'antlr4' executable in path
antlr4 -Dlanguage=CSharp Gama.g4 -visitor -listener
