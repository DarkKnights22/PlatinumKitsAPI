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
public class KitUpgradeEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final Kit kit;
    private final KitLevel currentKitLevel;
    private final KitLevel nextKitLevel;
    private boolean cancelled = false;

    public KitUpgradeEvent(Player player, Kit kit, KitLevel currentKitLevel, KitLevel nextKitLevel) {
        this.player = player;
        this.kit = kit;
        this.currentKitLevel = currentKitLevel;
        this.nextKitLevel = nextKitLevel;
    }

    /**
     * @return The {@link Player player} who will have the upgraded {@link Kit kit}.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return The {@link Kit kit} the player will upgrade.
     */
    public Kit getKit() {
        return kit;
    }

    /**
     * @return The current {@link KitLevel kitlevel} the player has for the {@link Kit kit}.
     *
     * @see #getKit()
     */
    public KitLevel getCurrentKitLevel() {
        return currentKitLevel;
    }

    /**
     * @return The next {@link KitLevel kitlevel} the player will have for the {@link Kit kit}.
     *
     * @see #getKit()
     */
    public KitLevel getNextKitLevel() {
        return nextKitLevel;
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
