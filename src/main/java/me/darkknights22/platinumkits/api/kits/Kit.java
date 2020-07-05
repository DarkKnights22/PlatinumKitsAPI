package me.darkknights22.platinumkits.api.kits;

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
     * @return The name shown in the GUI when the {@link Kit kit} is available for the
     * {@link org.bukkit.entity.Player player}.
     */
    String getAvailableName();

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
     * @return The lore shown in the GUI when the {@link Kit kit} is available for the
     * {@link org.bukkit.entity.Player player}.
     */
    List<String> getAvailableLore();

    /**
     * @return The name shown in the GUI when the {@link Kit kit} is on cooldown for the
     * {@link org.bukkit.entity.Player player}.
     */
    String getOnCooldownName();

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
     * @return The lore shown in the GUI when the {@link Kit kit} is on cooldown for the
     * {@link org.bukkit.entity.Player player}.
     */
    List<String> getOnCooldownLore();

    /**
     * @return The name shown in the GUI when the {@link org.bukkit.entity.Player player} does not have permission to
     * redeem the {@link Kit kit}.
     */
    String getNoPermissionName();

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
     * @return The lore shown in the GUI when the {@link org.bukkit.entity.Player player} does not have permission to
     * redeem the {@link Kit kit}.
     */
    List<String> getNoPermissionLore();

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
