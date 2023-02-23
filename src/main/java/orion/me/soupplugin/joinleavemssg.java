package orion.me.soupplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class joinleavemssg implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getDisplayName() + " is back to eat soup and kick ass");
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "eat ur soup and get to work");
        } else {
            e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getDisplayName() + " has arrived to eat soup and kick ass");
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "welcome to second shores. have some soup.");
        }



        PlayerInventory inventory = player.getInventory();
        ItemStack soup = new ItemStack(Material.BEETROOT_SOUP);

        ItemMeta soupMeta = soup.getItemMeta();
        soupMeta.setDisplayName("tasty soup");
        soup.setItemMeta(soupMeta);

        if (!inventory.contains(soup)) {
            inventory.addItem(soup);
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " has gone to eat some soup :)");
    }

}
