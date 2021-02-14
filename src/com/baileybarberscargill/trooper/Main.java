package com.baileybarberscargill.trooper;

import com.baileybarberscargill.trooper.commands.PingCommand;
import com.baileybarberscargill.trooper.commands.ToggleEnd;
import com.baileybarberscargill.trooper.commands.ToggleNether;
import com.baileybarberscargill.trooper.listeners.DeathTempBan;
import com.baileybarberscargill.trooper.listeners.EndPortalListener;
import com.baileybarberscargill.trooper.listeners.NetherPortalListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public static boolean netherstatus;
    public static boolean endstatus;

    @Override
    public void onEnable(){
        System.out.print(ChatColor.GREEN + "TrooperHX Enabled.");
        plugin = this;

        //Register Commands
        getCommand("enablenether").setExecutor(new ToggleNether());
        getCommand("disablenether").setExecutor(new ToggleNether());
        getCommand("enableend").setExecutor(new ToggleEnd());
        getCommand("disableend").setExecutor(new ToggleEnd());
        getCommand("ping").setExecutor(new PingCommand());

        //Register Listeners
        getServer().getPluginManager().registerEvents(new DeathTempBan(), this);
        getServer().getPluginManager().registerEvents(new NetherPortalListener(), this);
        getServer().getPluginManager().registerEvents(new EndPortalListener(), this);


    }


    @Override
    public void onDisable(){
        System.out.print(ChatColor.RED + "TrooperHX Disabled.");
        plugin = null;
    }

}
