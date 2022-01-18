package me.shreyasayyengar.nocraftingsystem;

import me.shreyasayyengar.nocraftingsystem.events.Open;
import me.shreyasayyengar.nocraftingsystem.utils.ConfigManager;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class NoCraftingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        ConfigManager.init(this);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(InventoryType.values()));
    }
    private void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new Open(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static NoCraftingPlugin getInstance() {
        return JavaPlugin.getPlugin(NoCraftingPlugin.class);
    }
}
