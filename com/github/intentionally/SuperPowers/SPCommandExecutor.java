package com.github.intentionally.SuperPowers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SPCommandExecutor implements CommandExecutor {

	@SuppressWarnings("unused")
	private SuperPowers plugin;
	
	public SPCommandExecutor(SuperPowers plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		
		
		return false;
	}
	
	// Command methods after this point
	
}
