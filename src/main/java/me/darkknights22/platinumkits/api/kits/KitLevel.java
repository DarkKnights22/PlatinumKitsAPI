package me.darkknights22.platinumkits.api.kits;

import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * @author DarkKnights22
 */
public interface KitLevel {

    /**
     * @return The chance that the {@link org.bukkit.entity.Player player} has to upgrade to this
     * {@link KitLevel kitlevel}.
     */
    int getChance();

    /**
     * @return The amount that the {@link org.bukkit.entity.Player player} has to pay to redeem this
     * {@link KitLevel kitlevel}.
     */
    int getPrice();

    /**
     * @return True if the player will be healed when redeeming this {@link KitLevel kitlevel}.
     */
    boolean isHealPlayer();

    /**
     * @return True if the player will be fed when redeeming this {@link KitLevel kitlevel}.
     */
    boolean isFeedPlayer();

    /**
     * @return The commands that will be executed when redeeming this {@link KitLevel kitlevel}
     */
    List<String> getCommands();

    /**
     * @return The items that will be given to the {@link org.bukkit.entity.Player} when redeeming this
     * {@link KitLevel kitlevel}
     */
    List<ItemStack> getItems();
}
