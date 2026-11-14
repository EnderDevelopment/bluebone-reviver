# BlueBone Reviver Minecraft Plugin

BlueBone Reviver is a Minecraft plugin that turns a player into a blue skeleton after respawn by equipping a skeleton skull and blue-dyed leather armor. It is a lightweight Paper Minecraft plugin with no commands, configuration files, permissions, or external services.

## Install

1. Build the plugin with Java 21 and Maven:
   ```bash
   mvn package
   ```
2. Copy the generated `target/plugin.jar` file into your Paper server's `plugins` directory.
3. Start or restart the server.
4. Confirm that the plugin is enabled in the server console or with `/plugins`.

Requirements:

- Paper 1.21.x with API compatibility for 1.21
- Java 21 or newer
- Maven 3.9 or newer when building from source

## Use

1. Join the server with the plugin installed.
2. Die and respawn, or trigger another player respawn event.
3. The player is equipped with:
   - A skeleton skull
   - Blue leather chestplate
   - Blue leather leggings
   - Blue leather boots
4. The player receives the message: “You have risen as a blue skeleton!”

The plugin replaces the player's current helmet and armor when the respawn event is handled.

---

More Minecraft plugin projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/e63ec900-d775-4af1-bc76-8faf561905e8?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=e63ec900-d775-4af1-bc76-8faf561905e8
