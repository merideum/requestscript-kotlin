#!/bin/bash

grammarVersion="0.0.14"

domain="https://raw.githubusercontent.com"
organization="merideum"
repository="merit"
lexerFile="MeritLexer.g4"
parserFile="MeritParser.g4"

url="$domain/$organization/$repository/$grammarVersion/$lexerFile"

echo "Pulling $lexerFile from $url"
echo ""
curl ${url} > MeritLexer.g4

echo ""

url="$domain/$organization/$repository/$grammarVersion/$parserFile"

echo "Pulling $parserFile from $url"
echo ""
curl ${url} > MeritParser.g4
