package fr.manwald.lucy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandDiamonds implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // We give the Item

            int quantity = 1;

            try {
                quantity = Integer.parseInt(args[0]);
            }catch (ArrayIndexOutOfBoundsException e){

            }

            ItemStack diamond = new ItemStack(Material.DIAMOND , quantity);
            player.getInventory().addItem(diamond);
        } else{
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "You are admin, you don't need diamond!");
        }

        // All is ok
        return true;
    }
}
