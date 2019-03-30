package fr.univubs.inf1603.mahjong.engine.scoring;

import fr.univubs.inf1603.mahjong.engine.scoring.IdentifiablePattern;

/**
 * Interface used to represent multiple {@link IdentifiablePattern IdentifiablePatterns}.
 * An implementation of this class should be a singleton since one instance is enough
 */
public interface AbstractPatternList {
    /**
     * Getter on the patterns
     * @return the patterns of the list
     */
    IdentifiablePattern[] getPatterns();
}
