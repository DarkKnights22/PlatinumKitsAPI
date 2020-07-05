package me.darkknights22.platinumkits.api.events;

import me.darkknights22.platinumkits.api.kits.Kit;
import me.darkknights22.platinumkits.api.kits.KitLevel;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author DarkKnights22
 */
public class KitGiveEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final Kit kit;
    private final KitLevel kitLevel;
    private boolean cancelled = false;

    public KitGiveEvent(Player player, Kit kit, KitLevel kitLevel) {
        this.player = player;
        this.kit = kit;
        this.kitLevel = kitLevel;
    }

    /**
     * @return The player receiving the {@link Kit kit}.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return The {@link Kit kit} the player will receive.
     */
    public Kit getKit() {
        return kit;
    }

    /**
     * @return The {@link KitLevel kitlevel} the player will receive.
     */
    public KitLevel getKitLevel() {
        return kitLevel;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
