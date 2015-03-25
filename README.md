Minecraft Mods
==============
This is the repository for the Minecraft mods written in collaboratively between [Flakeparadigm](https://flakeparadigm.com) and [Iroknight](https://github.com/Iroknight). These mods have been designed for use with the [Forge Mod Loader](http://minecraftforge.net).

Mod Structure
-------------
Each directory contains the source of the mod project (mod/src) and the builds (mod/release), if any. For more information on the individual mods, check the README.md files in their directories.

Other Tools
-----------
Also included in this repository are the batch scripts used to help make our lives easier when developing by letting us drag and drop project folders onto them to perform common functions.
- _buildmod.bat_: runs the _gradlew build_ command to produce a compiled jar file using the project directory(s) given to it as parameters, then copies the built files into (mod/release).
- _updatefml.bat_: runs the _gradlew setupDevWorkspace eclipse_ command to create or update the workspace.