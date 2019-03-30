/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.univubs.inf1603.mahjong.engine.rules;

import fr.univubs.inf1603.mahjong.engine.game.GameTile;
import java.util.List;

/**
 *
 * @author Abdelilah MOULIDA
 */

/**
 * 
 * StartingWall : class can be usefull if we need to display where the breach is formed on the wall
 */
public class StartingWall 
{
    /**
     * Variables :
     */
    private int startingSide;
    private int startingHeap;
    private List<GameTile> cut;
    
    /**
     * 
     * @param startingSide
     * @param startingHeap
     * @param cut 
     */
    StartingWall(int startingSide, int startingHeap, List<GameTile>cut)
    {
        this.startingSide = startingSide;
        this.startingHeap = startingHeap;
        this.cut = cut;
    }
    
    /**
     * getters and setters
     */
    
    /**
     * return the starting side
     * @return 
     */
    public int getStartingSide() {
        return startingSide;
    }
    
    /**
     * return the starting heap
     * @return 
     */
    public int getStartingHeap() {
        return startingHeap;
    }
    
    /**
     * return the cut
     * @return 
     */
    public List<GameTile> getCut() {
        return cut;
    }
    
    /**
     * modify the starting side
     * @param startingSide 
     */
    public void setStartingSide(int startingSide) {
        this.startingSide = startingSide;
    }
    
    /**
     * modify the starting heap
     * @param startingHeap 
     */
    public void setStartingHeap(int startingHeap) {
        this.startingHeap = startingHeap;
    }
    
    /**
     * modify the cut
     * @param cut 
     */
    public void setCut(List<GameTile> cut) {
        this.cut = cut;
    }
}
