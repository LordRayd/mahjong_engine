/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.univubs.inf1603.mahjong.engine.rules;
import fr.univubs.inf1603.mahjong.engine.game.GameTile;
import fr.univubs.inf1603.mahjong.engine.game.Move;
import fr.univubs.inf1603.mahjong.engine.game.TileZone;
import fr.univubs.inf1603.mahjong.engine.game.Zone;
import fr.univubs.inf1603.mahjong.sapi.*;
import static java.nio.file.Files.move;

import java.util.*;
import javax.swing.text.View;

/**
 *
 * @author Abdelilah MOULIDA
 */

import java.util.logging.Level;
/**
 * 
 * BoardRule : interface to manage rules for the board
 */
public interface BoardRule 
{
    /**
     * getting player in order
     * @param players
     * @return 
     */
    public List<Player> getPlayerOrder (List<Player>players);
    
    /**
     * starting the wall for the game
     * @return 
     */
    public StartingWall buildWall();
    
    /**
     * for the distribution of tiles
     * @param startingWall
     * @return 
     */
    public Map<GameTile, TileZone> distributeTiles(StartingWall startingWall);
    
    /**
     * check if the move done is respect rules or no
     * @param tileArrangement
     * @param move
     * @return 
     */
    public boolean isMoveValid(Map<GameTile, TileZone> tileArrangement, Move move);
    
    /**
     * show possible moves that respect rules
     * @param tileArrangement
     * @return 
     */
    public List<Move> findValidMoves(Map<GameTile, TileZone> tileArrangement);
    
    /**
     * checking if the game is finish and return a boolean
     * @param tileArrangement
     * @return 
     */
    public boolean isGameFinished(Map<GameTile, TileZone> tileArrangement);
}
