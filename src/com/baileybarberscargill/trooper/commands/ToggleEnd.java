package com.baileybarberscargill.trooper.commands;

import com.baileybarberscargill.trooper.listeners.EndPortalListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static com.baileybarberscargill.trooper.Main.endstatus;

public class ToggleEnd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("enableend")){
            if (sender.hasPermission("end.toggle")){
                endstatus = true;
                Bukkit.broadcastMessage(ChatColor.GREEN + "End enabled by " + sender.getName());
            }
        }
        if (cmd.getName().equalsIgnoreCase("disableend")){
            if (sender.hasPermission("end.toggle")){
                endstatus = false;
                Bukkit.broadcastMessage(ChatColor.RED + "End disabled by " + sender.getName());
            }

        }

        return true;
    }
}
