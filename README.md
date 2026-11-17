# Carpet Fixes — Unofficial 1.21.1 Fabric Port

An unofficial compatibility port of [Carpet Fixes](https://github.com/fxmorin/carpet-fixes) for Minecraft 1.21.1. The code base comes from [tomalbrc's 1.21 branch](https://github.com/tomalbrc/carpet-fixes), with compatibility fixes for 1.21.1.

This is not an official release and is not endorsed by the original authors.

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16.9 or newer
- Fabric Carpet `1.21-1.4.147+v240613` or newer
- Java 21

Fabric API is not required. Conditional Mixin is bundled in the mod JAR.

## Install and configure

Put the mod and Fabric Carpet in the `mods` folder. Configure settings with `/carpet-fixes`; use `/carpet-fixes list` to display them.

## Port coverage

The port currently carries the 232 settings present in the 1.21 base branch. That branch does not include 20 settings from the 1.20 source, so this release does not claim to contain those settings. The missing names are:

`blackstoneButtonBreakSpeedFix`, `crossDimensionTeleportLosesStatsFix`, `delayBetweenAutoSaves`, `endPortalRemovesEffectsFix`, `entityBlockCollisionUsingCenterFix`, `fallingBlocksCantUseNetherPortalsFix`, `incorrectNbtChecks`, `lightningKillsDropsFix`, `maxTickLatency`, `obsidianPlatformDestroysBlocksFix`, `optimizedPoweredRails`, `petsBreakLeadsDuringReloadFix`, `pistonUpdateOrderIsLocationalFix`, `reIntroduceReverseRailUpdateOrder`, `repairCostItemNotStackingFix`, `soulSpeedIncorrectDamageFix`, `statusUpdateDelay`, `sweepingIgnoresFireAspectFix`, `tntCantUseNetherPortalsFix`, and `transparentBlocksNegateEnchantingFix`.

## Credits and license

- Original Carpet Fixes: FX - PR0CESS (`fxmorin`)
- 1.21 source base: `tomalbrc`
- 1.21.1 compatibility changes: `JustHari01`
- License: MIT; see [`LICENSE`](LICENSE). Keep the original copyright and license notice with redistributed copies.

The icon and other assets are carried over from the MIT-licensed source tree; no new AI-generated artwork is included.

## Public source and verification

The source for this 1.21.1 port is published at https://github.com/JustHari01/Carpet-Fixes-1.21.1-Fabric-Port.

A Java 21 build and a short isolated Minecraft 1.21.1 Fabric server check passed. The check confirmed startup, listing 232 rules with `/carpet-fixes list`, and saving/stopping the test world. It did not exercise every rule or establish long-term stability. The 20 rules listed above remain unavailable in this port.

## AI disclosure

AI assistance was used to inspect compatibility, make the 1.21.1 port changes, and review the isolated runtime test. The underlying mod code and icon come from the credited MIT-licensed projects.
