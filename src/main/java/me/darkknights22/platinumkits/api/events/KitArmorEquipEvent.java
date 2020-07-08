package me.darkknights22.platinumkits.api.events;

import me.darkknights22.platinumkits.api.kits.Kit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * @author DarkKnights22
 */
public class KitArmorEquipEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final Kit kit;
    private final ItemStack armorPiece;
    private boolean cancelled = false;

    public KitArmorEquipEvent(Player player, Kit kit, ItemStack armorPiece) {
        this.player = player;
        this.kit = kit;
        this.armorPiece = armorPiece;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The {@link Player player} who will have the armour piece equipped {@link Kit kit}.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return The {@link Kit kit} the playeris redeeming.
     */
    @Nonnull
    public Kit getKit() {
        return kit;
    }

    /**
     * @return The newly equipped armor, never null nor air.
     */
    @Nonnull
    public ItemStack getArmorPiece() {
        return armorPiece;
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

}
