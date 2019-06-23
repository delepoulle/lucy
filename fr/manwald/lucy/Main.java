package fr.manwald.lucy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){


            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Free diamonds for you!");

            // Register our command "kit" (set an instance of your command class as executor)
            this.getCommand("diamonds").setExecutor(new CommandDiamonds());

    }

    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("A la prochaine !");

    }
}
