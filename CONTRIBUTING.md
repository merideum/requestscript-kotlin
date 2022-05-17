# Setup
Run `jabba use` in the root directory to pick up the correct JDK.

Make sure you can run the scripts locally:
`chmod +x ./scripts/get-grammar.sh`
`chmod +x ./scripts/generate-antlr.sh`

Run `./scripts/get-grammar.sh` to pull the ANTLR grammar for Merit. 
This command may fail due to the file hosting de-caching. 
Go to the raw location in a browser to reset it.

# Generating Lexer and Parser
The ANTLR code is generated with the following command:

Or `./scripts/generate-antlr.sh`

## Generating manually
The ANTLR classes can also be generated with the aliased command manually:
```
antlr4 -Dlanguage=Java -visitor -o ./merit/antlr/src/main/java/org/merideum/merit/antlr -package org.merideum.merit.antlr Merit.g4
```

> Make sure you have already set up the alias in your shell: `alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-YOUR_ANTLR_VERSION-complete.jar:$CLASSPATH" org.antlr.v4.Tool'`
