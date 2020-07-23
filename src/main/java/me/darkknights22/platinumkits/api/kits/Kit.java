package me.darkknights22.platinumkits.api.kits;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

/**
 * @author DarkKnights22
 */
public interface Kit {

    /**
     * @return The id of the {@link Kit kit}.
     */
    String getId();

    /**
     * @return The amount the {@link Kit kit} will cost the {@link org.bukkit.entity.Player player} to unlock. 0 if none.
     */
    double getOneTimeCost();

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's available name.
     * @return The available name for the kit, parsed with PlaceholderAPI placeholders.
     */
    String getAvailableName(Player player);

    /**
     * @return The material shown in the GUI when the {@link Kit kit} is available for the
     * {@link org.bukkit.entity.Player player}.
     */
    String getAvailableMaterial();

    /**
     * @return The material data for the {@link #getAvailableMaterial() available material}.
     */
    int getAvailableMaterialData();

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's available lore.
     * @return The available lore for the kit, parsed with PlaceholderAPI placeholders.
     */
    List<String> getAvailableLore(Player player);

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's on cooldown name.
     * @return The on cooldown name for the kit, parsed with PlaceholderAPI placeholders.
     */
    String getOnCooldownName(Player player);

    /**
     * @return The material shown in the GUI when the {@link Kit kit} is on cooldown for the
     * {@link org.bukkit.entity.Player player}.
     */
    String getOnCooldownMaterial();

    /**
     * @return The material data for the {@link #getOnCooldownMaterial() on cooldown material}.
     */
    int getOnCooldownMaterialData();

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's on cooldown lore.
     * @return The on cooldown lore for the kit, parsed with PlaceholderAPI placeholders.
     */
    List<String> getOnCooldownLore(Player player);

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's no permission name.
     * @return The no permission name for the kit, parsed with PlaceholderAPI placeholders.
     */
    String getNoPermissionName(Player player);

    /**
     * @return The material shown in the GUI when the {@link org.bukkit.entity.Player player} does not have permission
     * to redeem the {@link Kit kit}.
     */
    String getNoPermissionMaterial();

    /**
     * @return The material data for the {@link #getNoPermissionMaterial() on cooldown material}.
     */
    int getNoPermissionMaterialData();

    /**
     * @param player The {@link org.bukkit.entity.Player player} viewing the kit's no permission lore.
     * @return The no permission lore for the kit, parsed with PlaceholderAPI placeholders.
     */
    List<String> getNoPermissionLore(Player player);

    /**
     * @return The time (in seconds) that the {@link org.bukkit.entity.Player player} has to wait before redeeming the
     * {@link Kit kit} again.
     */
    int getCooldown();

    /**
     * @return The permission that the {@link org.bukkit.entity.Player player} needs to redeem the {@link Kit kit}.
     */
    String getPermission();

    /**
     * @return The {@link org.bukkit.Sound sound} name that is played when the {@link org.bukkit.entity.Player player}
     * redeems the {@link Kit kit}.
     */
    String getSound();

    /**
     * @return The {@link org.bukkit.Effect effect} name that is played when the {@link org.bukkit.entity.Player player}
     * redeems the {@link Kit kit}.
     */
    String getEffect();

    /**
     * @return The messages that are broadcasted when the {@link org.bukkit.entity.Player player} redeems the {@link Kit kit}.
     */
    List<String> getBroadcasts();

    /**
     * @return The max level for the {@link Kit kit}.
     */
    int getMaxLevel();

    /**
     * @return The map of {@link KitLevel kitlevels} for each level in the {@link Kit kit}.
     */
    Map<Integer, KitLevel> getKitLevels();

    /**
     * @return True if the {@link #getKitLevels() kitlevels} contains a key of the level.
     */
    boolean isValidLevel(int level);
}
