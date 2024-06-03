#!/bin/bash

rm -r ./core/antlr/src/main/java/org/merideum/antlr

java -Xmx500M -cp "/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Java -visitor -o ./core/antlr/src/main/java/org/merideum/antlr -package org.merideum.antlr Merideum.g4

echo "Generated Java ANTLR classes"
