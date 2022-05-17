# Setup
Run `jabba use` in the root directory to pick up the correct JDK.

Run `./scripts/get-grammar.sh` to pull the ANTLR grammar for Merit.

# Generating Lexer and Parser
The ANTLR code is generated with the following command:
```
antlr4 -Dlanguage=Java -visitor -o ./merit/antlr/src/main/java/org/merideum/merit/antlr -package org.merideum.merit.antlr Merit.g4
```
