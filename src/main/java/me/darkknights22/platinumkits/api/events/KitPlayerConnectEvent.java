package me.darkknights22.platinumkits.api.events;

import me.darkknights22.platinumkits.api.players.KitPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * @author DarkKnights22
 */
public class KitPlayerConnectEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final KitPlayer kitPlayer;

    public KitPlayerConnectEvent(KitPlayer kitPlayer) {
        this.kitPlayer = kitPlayer;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return the {@link KitPlayer} account that connected to the server.
     */
    public KitPlayer getKitPlayer() {
        return kitPlayer;
    }

    /**
     * @return the {@link Player} that has connected to the server.
     */
    public Player getPlayer() {
        return kitPlayer.getPlayer();
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
