@ECHO OFF
title Making run files, and building Eclipse workspace..
cd..
SET JAVA_HOME="%~dp0runtime"
gradlew.bat eclipse
PAUSE