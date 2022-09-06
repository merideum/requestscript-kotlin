# Setup

Run `jabba use` in the root directory to pick up the correct JDK.

Make sure you can run the scripts locally:
`chmod +x ./scripts/get-grammar.sh`
`chmod +x ./scripts/generate-antlr.sh`

Run `./scripts/get-grammar.sh` to pull the ANTLR grammar for the Merideum scripting language.
This command may fail due to the file hosting de-caching.
Go to the raw location in a browser to reset it.

# Generating Lexer and Parser

Merideum uses ANTLR4 to generate lexer and parser code in the implementation langauge. The ANTLR code is generated to
Kotlin/Java with the following command:

Or `./scripts/generate-antlr.sh`

> Make sure you have already set up the alias in your
> shell: `alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-YOUR_ANTLR_VERSION-complete.jar:$CLASSPATH" org.antlr.v4.Tool'`

# Versioning

This repository follows [semantic versioning](https://semver.org/).

# Code Analysis
merideum-kotlin uses [Detekt](https://detekt.dev/) for code analysis and formatting. 
Be sure to run the `detekt` gradle task often when developing locally. 
This task is run as part of the pipeline and will fail the build if there are issues.
Detekt has an IntelliJ plugin to provide faster feedback.
