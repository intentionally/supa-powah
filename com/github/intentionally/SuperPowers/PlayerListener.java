package com.github.intentionally.SuperPowers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerListener implements Listener {
	
	public PlayerListener(SuperPowers plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        
    }
	@EventHandler
	public void onCustomEvent(CustomEvent event) {
		
	}
}
