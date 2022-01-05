#!/bin/bash

echo -n "DoomsdayMod Version: "; read version

cd ..
./bin/gradlew -PprojVersion=$version copy_linux