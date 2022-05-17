#!/bin/bash

grammarName="Merit.g4"

rm -r ./merit/antlr/src/main/java/org/merideum/merit/antlr

java -Xmx500M -cp "/usr/local/lib/antlr-4.10.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Java -visitor -o ./merit/antlr/src/main/java/org/merideum/merit/antlr -package org.merideum.merit.antlr Merit.g4

echo "Generated Java ANTLR classes for grammar $grammarName"
