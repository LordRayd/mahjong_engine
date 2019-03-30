# Mahjong Engine Design Document

This document provide information about the package of the engine module.
Our module becomes bigger and bigger if it continues we will have problem to find the file.
We decide to split the module in 3 part:
* game : contains all the game Object like the Board, Zone ...
* rules : contains the tiles and the rules applicable
* scoring : contains all the classes who help to do the scoring

We will certainly do some other sub-package like a package tiles in rules.

## Normalised naming of mahjong package

```
engine  
│
└───game
|   |   Board.java
|   |   Game.java
|   |   GameException.java
|   |   GameTile.java
|   |   GameZone.java
|   |   Meld.java
|   |   MeldZone.java
|   |   Move.java
|   |   MoveException.java
|   |   TileZone.java
|   |   UniqueIdentifiable.java
|   |   Zone.java
|   |   ZoneException.java
|
└───rules
|   │   AbstractTiles.java
|   |   BoardRule.java
|   │   CommonTile.java
|   |   Complex.Tile.java
|   |   Flower.java
|   |   HiddenTile.java
|   |   HonorTile.java
|   |   Season.java
|   |   SimpleHonor.java
|   |   StartingWall.java
|   |   SuperiorHonor.java
|   |   SupremeHonor.java
|   |   WindHonor.java
|
└───scoring
|   |   AbstractPatternList.java
|   |   Combination.java
|   |   IdentifiablePattern.java
|   |   IdentifiedPattern.java
|   |   InternationalPatternList.java
|   |   PlayerSet.java
```