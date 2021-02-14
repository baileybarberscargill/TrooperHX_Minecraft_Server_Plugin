package com.baileybarberscargill.trooper.listeners;

import com.baileybarberscargill.trooper.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static com.baileybarberscargill.trooper.Main.endstatus;

public class EndPortalListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (endstatus == false){
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getClickedBlock().getType().equals(Material.END_PORTAL_FRAME) && player.getInventory().getItemInMainHand().getType().equals(Material.ENDER_EYE)){
                player.sendMessage(ChatColor.RED + "The end is currently disabled!");
                event.setCancelled(true);
            }
        }
    }
}
