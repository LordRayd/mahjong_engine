package fr.univubs.inf1603.mahjong.engine.scoring;

import fr.univubs.inf1603.mahjong.engine.scoring.Combination;
import fr.univubs.inf1603.mahjong.engine.rules.WindHonor;
import fr.univubs.inf1603.mahjong.engine.rules.SupremeHonor;
import fr.univubs.inf1603.mahjong.engine.game.GameTile;
import java.util.Collection;

public class PlayerSet {
    private GameTile winningTile;
    private Collection<Combination> hand;
    private Collection<Combination> concealed;
    private Collection<Combination> melds;
    private Collection<SupremeHonor> supremeHonors;
    private boolean drawnFromWall;
    private boolean takenFromDiscard;
    private WindHonor.Wind roundWind;
    private WindHonor.Wind playerWind;
}
