#!/bin/bash

rm -r ./server/antlr/src/main/java/org/merideum/antlr

java -Xmx500M -cp "/usr/local/lib/antlr-4.10.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Java -visitor -o ./server/antlr/src/main/java/org/merideum/antlr -package org.merideum.antlr MerideumParser.g4 MerideumLexer.g4

echo "Generated Java ANTLR classes"
