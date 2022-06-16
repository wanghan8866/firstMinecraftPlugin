package com.luke.test;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MoveCommand implements CommandExecutor {

    private Main main;

    public MoveCommand(Main main){
        this.main=main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player){
            Player player= (Player) sender;
            main.setCanMove(!main.getCanMove());
            if(main.getCanMove()){
                player.sendMessage("The player is set to be free");
            }else{
                player.sendMessage(ChatColor.RED+"The player is set to be frozen");
            }

        }
        return false;
    }
}
