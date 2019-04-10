package fr.univubs.inf1603.mahjong.engine.game;

import java.util.ArrayList;

/**
 * Represente la zone de jeu d'un joueur
 * Comprend sa main, sa defausse et ses combinaisons
 * @author Samuel LE BERRE
 */
public class PlayerZone {
    
    /**
     * La zone ou se trouve sa main
     */
    private TileZone hand;
    /**
     * La zone ou se trouve sa defausse
     */
    private TileZone discard;
    /**
     * La zone contenant ses combinaisons
     */
    private ArrayList<MeldZone> meldzone;
    
    /**
     * Contructeur de zones de joueur a partir de 2 zones de tuiles et d'une List de zone de combianaisons
     * @param hand Une zone de tuiles representant sa main
     * @param discard Une zone de tuile representant sa defausse
     * @param meldzone Une liste de ses zones de combianaisons
     */
    public PlayerZone(TileZone hand,TileZone discard,ArrayList<MeldZone> meldzone){
        this.hand = hand;
        this.discard = discard;
        this.meldzone = meldzone;
    }
    
    public PlayerZone(TileZone hand, TileZone discard){
        this.hand = hand;
        this.discard = discard;
        this.meldzone = new ArrayList<MeldZone>();
    }

    /**
     * Retourne la main du joueur
     * @return Une liste de GameTile representant la main du joueur
     */
    public ArrayList<GameTile> getHand(){
        return this.hand.getTiles();
    }
    
    /**
     * Retourne la zone de sa main
     * @return La zone de sa main
     */
    public TileZone getHandZone() {
        return this.hand;
    }

    /**
     * Affecte une zone à la zone de la main d un joueur
     * @param hand La zone qui sera la main
     */
    public void setHandZone(TileZone hand) {
        this.hand = hand;
    }

    /**
     * Retourne la zone de sa defausse
     * @return La zone de sa defausse
     */
    public TileZone getDiscard() {
        return this.discard;
    }

    /**
     * Affecte une zone à la zone de la defausse d un joueur
     * @param discard La zone qui sera la defausse
     */
    public void setDiscard(TileZone discard) {
        this.discard = discard;
    }

    /**
     * Retourne la liste des zones de combinaisons
     * @return La zone de sa defausse
     */
    public ArrayList<MeldZone> getMeldzone() {
        return this.meldzone;
    }

    /**
     * Affecte une list à la liste des zones de combianaisons d un joueur
     * @param meldzone La liste qui sera la liste des zones de combinaisons
     */
    public void setMeldzone(ArrayList<MeldZone> meldzone) {
        this.meldzone = meldzone;
    }  
    
}
