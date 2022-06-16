package com.luke.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEventListener implements Listener {

    private Main main;

    public MoveEventListener(Main main){
        this.main=main;
    }

    @EventHandler
    public void onPlayMoveEvent(PlayerMoveEvent pe){
        if(!main.getCanMove()){
            pe.setCancelled(true);
            pe.getPlayer().sendMessage("You are frozen!");
        }
        else{
            pe.setCancelled(false);
        }

    }
}
