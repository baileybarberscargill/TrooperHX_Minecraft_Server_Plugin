package com.baileybarberscargill.trooper.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static com.baileybarberscargill.trooper.Main.netherstatus;

public class ToggleNether implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("enablenether")){
            if (sender.hasPermission("nether.toggle")){
                netherstatus = true;
                Bukkit.broadcastMessage(ChatColor.GREEN + "Nether enabled by " + sender.getName());
            }
        }

        if (cmd.getName().equalsIgnoreCase("disablenether")){
            if (sender.hasPermission("nether.toggle")){
                netherstatus = false;
                Bukkit.broadcastMessage(ChatColor.RED + "Nether disabled by " + sender.getName());
            }

        }

        return true;
    }
}
