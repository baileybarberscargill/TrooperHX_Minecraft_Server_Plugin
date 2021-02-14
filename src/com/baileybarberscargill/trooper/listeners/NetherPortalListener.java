package com.baileybarberscargill.trooper.listeners;

import com.baileybarberscargill.trooper.Main;
import com.baileybarberscargill.trooper.commands.ToggleNether;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static com.baileybarberscargill.trooper.Main.netherstatus;

public class NetherPortalListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (netherstatus == false){
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getClickedBlock().getType() == Material.OBSIDIAN) {
                if (player.getInventory().getItemInMainHand().getType().equals(Material.FLINT_AND_STEEL)){
                    player.sendMessage(ChatColor.RED + "The nether is currently disabled!");
                    event.setCancelled(true);
                }
            }
        }
    }
}

