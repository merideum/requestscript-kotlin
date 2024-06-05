#!/bin/bash

rm -r ./core/antlr/src/main/java/org/requestscript/antlr

java -Xmx500M -cp "/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Java -visitor -o ./core/antlr/src/main/java/org/requestscript/antlr -package org.requestscript.antlr RequestScript.g4

echo "Generated Java ANTLR classes"
