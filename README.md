# Emacs Keymap for Mac OS

![Build](https://github.com/at-ishikawa/intellij-plugin-keymap-emacs-macos/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/17289.svg)](https://plugins.jetbrains.com/plugin/17289)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/17289.svg)](https://plugins.jetbrains.com/plugin/17289)

<!-- Plugin description -->
An unofficial emacs keymap for a Mac keyboard on IntelliJ IDEs.
Unlike the default Emacs keymap, the CMD key is used as the META key for shortcuts.

Custom keymaps
---

### Shortcut keys from tags
1. *M-.*: Go to Declaration or Usages
2. *M-\* (CMD-SHIFT-8)*: Navigate > Back
<!-- Plugin description end -->

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [x] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

## Installation

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "intellij-plugin-keymap-emacs-macos"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/at-ishikawa/intellij-plugin-keymap-emacs-macos/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
