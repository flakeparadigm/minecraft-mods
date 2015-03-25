@ECHO OFF

set OLDDIR=%CD%

:Loop
IF "%1"=="" GOTO Continue
  set env_dir=%1
  
  cd %env_dir%
  call gradlew build
  xcopy /S /E /I /Y build\libs release
  
SHIFT
GOTO Loop
:Continue

cd %OLDDIR%