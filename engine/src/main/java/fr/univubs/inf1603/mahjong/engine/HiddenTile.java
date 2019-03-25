package fr.univubs.inf1603.mahjong.engine;

/**
 * @author COGOLUEGNES Charles, LE BERRE Samuel
 * Une réprésentation d'une tuile cachée
 */
public class HiddenTile implements AbstractTile{
  /**
   * Le nom générique d'une tuile cachée
   */
  private static final name = "XX";
  
  /**
   * Le constructeur de HiddenTile
   */
  public HiddenTile(){ 
  }
  
  @Override
  public String toNormalizedName(){
    return this.name;
  }
}