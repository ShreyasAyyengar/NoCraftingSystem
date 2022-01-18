package me.shreyasayyengar.nocraftingsystem.events;

import me.shreyasayyengar.nocraftingsystem.utils.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class Open implements Listener {

    @EventHandler
    private void onOpen(InventoryOpenEvent e) {
        if (ConfigManager.shouldCancel(e.getInventory().getType())) {
            e.setCancelled(true);
        }
    }
}
