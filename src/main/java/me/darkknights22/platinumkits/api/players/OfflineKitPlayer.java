package me.darkknights22.platinumkits.api.players;

import me.darkknights22.platinumkits.api.kits.Kit;

import java.util.Map;
import java.util.UUID;

public interface OfflineKitPlayer {

    UUID getUUID();

    int getKitLevel(Kit kit);

    void setKitLevel(Kit kit, int level);

    Map<Kit, Integer> getKitLevels();

}
