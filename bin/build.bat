@echo off

set /P version="ObsidianArmor Version: "

cd ..
cmd /k bin\gradlew.bat -PprojVersion=%version% copy --stacktrace