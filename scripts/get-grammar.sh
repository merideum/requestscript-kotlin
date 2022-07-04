#!/bin/bash

grammarVersion="0.0.7"

domain="https://raw.githubusercontent.com"
organization="merideum"
repository="merit"
grammarFile="Merit.g4"

url="$domain/$organization/$repository/$grammarVersion/$grammarFile"

echo "Pulling $grammarFile from $url"
echo ""
curl ${url} > Merit.g4
