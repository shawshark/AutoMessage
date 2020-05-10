package me.shawshark.automessage;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerUtils {
	public static void msg(Player player, String msg, boolean colour) {
		
		if(colour)
			msg = ChatColor.translateAlternateColorCodes('&', msg);
		
		if(player == null) {
			System.out.println(msg);
			//Bukkit.broadcastMessage(msg);
		} else {
			player.sendMessage(msg);
		}
	}
	
	public static void msg(Player player, String msg) {
		
		msg = ChatColor.translateAlternateColorCodes('&', msg);
		
		if(player == null) {
			System.out.println(msg);
			//Bukkit.broadcastMessage(msg);
		} else {
			player.sendMessage(msg);
		}
	}
	
	public static void msg(CommandSender sender, String msg) {
		
		msg = ChatColor.translateAlternateColorCodes('&', msg);
		
		if(sender == null) {
			System.out.println(msg);
			//Bukkit.broadcastMessage(msg);
		} else {
			sender.sendMessage(msg);
		}
	}
}
