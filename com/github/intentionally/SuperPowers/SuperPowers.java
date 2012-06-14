package com.github.intentionally.SuperPowers;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SuperPowers extends JavaPlugin {
	
	Logger log;
	private SPCommandExecutor executor;
	
	public void onEnable() {
		log = this.getLogger();
		executor = new SPCommandExecutor(this);
		
		log.info("SuperPowers enabled.");
		new PlayerListener(this);
		
		
	}
	public void onDisable() {
		log.info("SuperPowers disabled.");
	}
	public void callEvent() {
		// Create the event here
		CustomEvent event = new CustomEvent("Sample Message");
		// Call the event
		Bukkit.getServer().getPluginManager().callEvent(event);
		// Now you do the event
		Bukkit.getServer().broadcastMessage(event.getMessage());
	}
}
