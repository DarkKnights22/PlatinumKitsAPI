package me.darkknights22.platinumkits.api.kits;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.io.IOException;

/**
 * @author DarkKnights22
 */
public interface KitsManager {

    /**
     * @param player The player to give the {@link Kit kit} to.
     * @param kitId The {@link Kit#getId() id} of the {@link Kit kit} to give the {@link Player player}.
     *
     * @see #getKit(String kitId)
     */
    void giveKit(Player player, String kitId);

    /**
     * @param player The player to give the {@link Kit kit} to.
     * @param kit The {@link Kit kit} to give the {@link Player player}.
     */
    void giveKit(Player player, Kit kit);

    /**
     * @param kitId The {@link Kit#getId() id} of the {@link Kit kit}.
     *
     * @return True if the {@link Kit kit} id is an id of an actual {@link Kit kit}.
     */
    boolean isValidKit(String kitId);

    /**
     * @param kitId The {@link Kit#getId() id} of the kit.
     * @param level The level of the {@link Kit kit}.
     *
     * @see KitLevel
     *
     * @throws IOException Thrown when the kit file cannot be written to for any reason.
     */
    void clearKitItems(String kitId, int level) throws IOException;

    /**
     * @param itemStack The itemstack to add to the {@link KitLevel kitlevel}.
     * @param kitId The id of the {@link Kit kit}.
     * @param level The level of the kit to add the item to.
     *
     * @see KitLevel
     * @throws IOException Thrown when the {@link Kit kit} file cannot be written to for any reason.
     */
    void addItemToKit(ItemStack itemStack, String kitId, int level) throws IOException;

    /**
     * @param kitId The id of the {@link Kit kit}.
     * @return The {@link Kit kit} with the id.
     */
    @Nullable
    Kit getKit(String kitId);
}
