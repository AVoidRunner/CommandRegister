package me.Mastervrunner.RegisterCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

//import me.Mastervrunner.TempRank.Main;

public class Registerd implements CommandExecutor{
	
	/*
	 * 
	 * (non-Javadoc)
	 * @see org.bukkit.command.CommandExecutor#onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[])
	 
	 static Main plugin;
	public TempRank(Main main) {
		plugin = main;
	}
	 *
	 */
	
	static Main plugin;
	//public REgist(Main main) {
	public Registerd(Main main) {
		plugin = main;
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

}
