package me.core.java.Events;

import me.core.java.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class onJoinEvent implements Listener {

    public String prefix = (ChatColor.GREEN + "HypedPvP>> ");
    private Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("");

        //First join items/message
        if (!player.hasPlayedBefore()){
            ItemStack item1 = new ItemStack(Material.IRON_HELMET, 1);
            ItemStack item2 = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemStack item3 = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemStack item4 = new ItemStack(Material.IRON_BOOTS, 1);
            ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD, 1);
            ItemStack item6 = new ItemStack(Material.BREAD, 16);
            ItemStack item7 = new ItemStack(Material.DIAMOND, 5);
            ItemStack item8 = new ItemStack(Material.WOOD, 64);
            player.getInventory().addItem(item1, item2, item3, item4, item5, item6, item7, item8);
            plugin.getServer().broadcastMessage(prefix + ChatColor.GOLD + player.getName() + " has joined for the first time!!");
        } else {
            player.sendMessage(prefix + ChatColor.GOLD + "Welcome back, " + player.getName());
        }
    }
}