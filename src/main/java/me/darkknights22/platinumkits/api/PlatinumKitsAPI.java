package me.darkknights22.platinumkits.api;

import me.darkknights22.platinumkits.api.kits.KitsManager;

/**
 * @author DarkKnights22
 */
public class PlatinumKitsAPI {

    private static KitsManager kitsManager;

    /**
     * @return The {@link KitsManager} object.
     */
    public static KitsManager getKitsManager() {
        return kitsManager;
    }
}
