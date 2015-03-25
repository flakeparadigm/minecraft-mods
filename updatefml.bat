@ECHO OFF

:Loop
IF "%1"=="" GOTO Continue
  set env_dir=%1
  
  cd %env_dir%
  gradlew setupDevWorkspace eclipse
  
SHIFT
GOTO Loop
:Continue