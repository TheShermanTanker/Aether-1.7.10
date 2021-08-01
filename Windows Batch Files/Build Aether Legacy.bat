@ECHO OFF
title Building Aether Legacy..
cd ..
SET JAVA_HOME="%~dp0runtime"
gradlew.bat build
PAUSE