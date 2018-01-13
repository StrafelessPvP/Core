package me.core.java;

import me.core.java.Events.onJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        Events();
    }

    @Override
    public void onDisable() {
    }

    public void Events() {
        getServer().getPluginManager().registerEvents(new onJoinEvent(), this);
    }

}
