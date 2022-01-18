package me.shreyasayyengar.nocraftingsystem.utils;

import me.shreyasayyengar.nocraftingsystem.NoCraftingPlugin;
import org.bukkit.event.inventory.InventoryType;

public class ConfigManager {

    private static NoCraftingPlugin main;

    public static void init(NoCraftingPlugin main) {
        ConfigManager.main = main;
        main.getConfig().options().configuration();
        main.saveDefaultConfig();
    }

    public static boolean shouldCancel(InventoryType type) {
        return main.getConfig().getBoolean("inventories." + type.name());
    }


}
