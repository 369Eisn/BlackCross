# BlackCross

A Fabric client mod project targeting Minecraft 1.21.11. This starter currently includes a custom black title screen, a silver cross, and a button that opens the game's `mods` folder.

## Build

Requirements: Java 21 and Gradle 8.14 or newer. From the repository directory run:

```sh
gradle build
```

On Windows, run `gradle.bat build` if Gradle is installed under that command. The mod jar is written to `build/libs/blackcross-1.0.0.jar`.

Install Fabric Loader and Fabric API for Minecraft 1.21.11, then copy the jar into `.minecraft/mods`.

## Cross next to player names: server requirement

A client cannot independently discover which remote players have BlackCross. That requires a server-side protocol endpoint: the server must have a compatible BlackCross server component installed and relay each player's presence to the other clients. This initial project does **not** yet implement that protocol or the name-tag renderer, and therefore does not claim to show crosses next to player names. Fabric mods in `.minecraft/mods` can be loaded by Fabric, but a client-only mod cannot make an unmodded server identify its users.

## Current limitations

The first-launch graphics preset (fast graphics, clouds off, minimal particles, render distance 8, and VSync off) and cross-player name-tag feature are not implemented in this initial project yet. The project is a buildable starting point for the title-screen and mods-folder UI.
