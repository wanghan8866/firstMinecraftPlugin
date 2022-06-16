package com.luke.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private boolean canMove=false;


    public boolean getCanMove(){
        return canMove;
    }

    public void setCanMove(boolean b){
        canMove=b;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("test").setExecutor(this);
        getCommand("move").setExecutor(new MoveCommand(this));
        Bukkit.getPluginManager().registerEvents(new MoveEventListener(this),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"This is working again!");
        if(sender instanceof Player){
            Player player= (Player) sender;
            player.sendMessage(ChatColor.GREEN+"Your health has been restored");
        }

        return true;
    }

}
