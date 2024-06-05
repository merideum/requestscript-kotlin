#!/bin/bash

grammarVersion="0.0.20"

domain="https://raw.githubusercontent.com"
organization="merideum"
repository="requestscript-lang"
grammarFile="RequestScript.g4"

url="$domain/$organization/$repository/$grammarVersion/$grammarFile"

echo "Pulling $grammarFile from $url"
echo ""
curl ${url} > RequestScript.g4
