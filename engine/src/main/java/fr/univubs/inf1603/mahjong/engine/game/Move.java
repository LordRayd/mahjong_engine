package fr.univubs.inf1603.mahjong.engine.game;

import fr.univubs.inf1603.mahjong.engine.game.TileZone;
import fr.univubs.inf1603.mahjong.engine.game.UniqueIdentifiable;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/**
 * Cette classe permet de représenter le déplacement d'une ou plusieurs tuiles
 * d'un joueur
 *
 * @author COGOLUEGNES Charles
 */
public class Move implements Serializable, Cloneable, UniqueIdentifiable {

    private final int player;
    private final int priority;
    private final HashMap<Integer, TileZone> path;
    private final UUID uuid;

    /**
     *
     * @param player Le nombre qui représente le numéro du joueur qui effectue
     * le Move
     * @param priority La priorité du Move par rapport à d'autre Move (0 est la
     * plus grosse priorité, n est la moins grosse priorité)
     * @param path Une Map qui contient l'information de déplacement de la ou
     * des tuile(s). Le numéro reprente l'ID de la tuile, la TileZone est la
     * zone de jeu dans laquelle la tuile va être ajoutée
     * @param uuid
     * @throws fr.univubs.inf1603.mahjong.engine.game.MoveException
     */
    @ConstructorProperties({"player", "priority", "path", "uuid"})
    public Move(int player, int priority, HashMap<Integer, TileZone> path, UUID uuid) throws MoveException {
        if (player <= 0 || player > 4) {
            throw new MoveException("The player's number has to be between 1 and 4.");
        }
        this.player = player;

        if (priority < 0) {
            throw new MoveException("The priority has to be positive or O");
        }
        this.priority = priority;

        if (path.isEmpty()) {
            throw new MoveException("The path can not be empty.");
        }
        this.path = path;

        this.uuid = uuid;
    }

    public Move(int player, int priority, HashMap<Integer, TileZone> path) throws MoveException {
        this(player, priority, path, UUID.randomUUID());
    }

    /**
     * Retourne le numéro du joueur associé au Move
     *
     * @return player
     */
    public int getPlayer() {
        return this.player;
    }

    /**
     * Retourne la priorité du Move
     *
     * @return priority
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Retourne le map symbolisant le déplacement
     *
     * @return path
     */
    public HashMap<Integer, TileZone> getPath() {
        return this.path;
    }

    /**
     *
     * @return
     */
    @Override
    public UUID getUUID() {
        return this.uuid;
    }
}
