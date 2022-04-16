#!/bin/bash

set -e

export M2_HOME="$(pwd)/.m2"

echo '#### FOO v1'
( cd foo-v1 && mvn install -q )

echo '#### FOO v2'
( cd foo-v2 && mvn install -q )

echo '#### bar'
( cd bar && mvn install -q )

echo '#### app'
( cd app && mvn install -q )

echo '## Run and watch it fail in compile time'
( cd app && mvn exec:java -Dexec.mainClass=com.app.Driver )
