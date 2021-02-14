package com.baileybarberscargill.trooper.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;

import static com.baileybarberscargill.trooper.Main.endstatus;

public class PingCommand implements CommandExecutor {

    String pingquality;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("ping")) {
            int ping = ((CraftPlayer) sender).getHandle().ping;
            if (ping <80){ pingquality = (ChatColor.GREEN + "(GOOD)"); }
            else if (ping < 120){ pingquality = (ChatColor.YELLOW + "(OK)"); }
            else{ pingquality = (ChatColor.RED + "(HIGH)"); }

            sender.sendMessage(ChatColor.YELLOW + "Your ping is: " + ping + "ms " + pingquality);
        }
        return true;
    }
}