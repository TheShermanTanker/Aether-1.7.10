@ECHO OFF
title Setting up Decomp Workspace..
cd ..
SET JAVA_HOME="%~dp0runtime"
gradlew.bat setupDecompWorkspace
PAUSE