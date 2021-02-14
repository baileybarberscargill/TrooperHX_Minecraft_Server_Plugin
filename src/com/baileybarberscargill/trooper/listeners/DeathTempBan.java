package com.baileybarberscargill.trooper.listeners;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathTempBan implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        String player = event.getEntity().getPlayer().getName();
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        String command = "tempban " +  player + " 12h You died!";
        Bukkit.dispatchCommand(console, command);
    }

}
