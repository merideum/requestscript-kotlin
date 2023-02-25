#!/bin/bash

grammarVersion="0.0.20"

domain="https://raw.githubusercontent.com"
organization="merideum"
repository="merideum-lang"
lexerFile="MerideumLexer.g4"
parserFile="Merideum.g4"

url="$domain/$organization/$repository/$grammarVersion/$lexerFile"

echo "Pulling $lexerFile from $url"
echo ""
curl ${url} > MerideumLexer.g4

echo ""

url="$domain/$organization/$repository/$grammarVersion/$parserFile"

echo "Pulling $parserFile from $url"
echo ""
curl ${url} > Merideum.g4
