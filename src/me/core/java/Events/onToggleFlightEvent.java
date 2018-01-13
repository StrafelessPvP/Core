package me.core.java.Events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class onToggleFlightEvent implements Listener {

    @EventHandler
    public void onFlight(PlayerToggleFlightEvent event){
        Player player = event.getPlayer();
        if (player.getGameMode() != GameMode.CREATIVE){
            event.setCancelled(true);
            Block block = player.getWorld().getBlockAt(player.getLocation().subtract(0, 2, 0));
            if (!block.getType().equals(Material.AIR)){
                Vector v = player.getLocation().getDirection().multiply(1).setY(1);
                player.setVelocity(v);
            }
        }
    }
}
