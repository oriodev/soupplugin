package orion.me.soupplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Soupplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new joinleavemssg(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
