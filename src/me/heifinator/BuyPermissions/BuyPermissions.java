package me.heifinator.BuyPermissions;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.Plugin;
 
public class BuyPermissions extends JavaPlugin {
	public static PermissionHandler permissionHandler;
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		setupPermissions();
		log.info("Your plugin has been enabled!");
	}
	
	public void onDisable(){
		log.info("Your plugin has been disabled.");
	}
	public boolean onCommand(CommandSender buyer, Command cmd, String commandLabel, String[] args){
		  
		  if(cmd.getName().equalsIgnoreCase("bp")){ // If the player typed /basic then do the following...
		    buyer.sendMessage(ChatColor.GREEN + "Good Job You Have Permission");
		    return true;
		  } //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
		  return false; }
	
	private void setupPermissions() {
	      Plugin permissionsPlugin = this.getServer().getPluginManager().getPlugin("Permissions");

	      if (!BuyPermissions.permissionHandler.has(player, "bp.user") {
	          if (permissionsPlugin != null) {
	              this.permissionHandler = ((Permissions) permissionsPlugin).getHandler();
	          } else {
	              log.info("Permission system not detected, defaulting to OP");
	          }
	      }
	}
	
}

