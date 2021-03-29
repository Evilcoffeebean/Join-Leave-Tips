package me.deathibring.com;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            final String[] MESSAGES = {
                    "&bGo and grab some wood first!",
                    "&dContact staff if you need some help.",
                    "&6Check out the crafting recipes if you can't remember how to make some items."
            };

            final Random r = new Random();
            int index = r.nextInt(MESSAGES.length);

            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', MESSAGES[index]));
        }
    }
}
