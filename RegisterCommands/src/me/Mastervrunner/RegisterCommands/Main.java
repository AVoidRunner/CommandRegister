package me.Mastervrunner.RegisterCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor{
	
	FileConfiguration config = getConfig();

	@Override
    public void onEnable() {
		
		config.addDefault("RegisterCommands", "ele, shop, Ele, Shop");
		
        config.options().copyDefaults(true);
        saveConfig();
		
		
        // Register our command "kit" (set an instance of your command class as executor)
		
		String initComamnds = config.getString("RegisterCommands");
		String[] seperatedCmds = initComamnds.split(", ");
		for(String cmd: seperatedCmds) {
			this.getCommand(cmd).setExecutor(new Registerd(this));
		}	
		
    }
	
	public void yeet() {
		
	}
	
	public  Main() {
		
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
	
}
