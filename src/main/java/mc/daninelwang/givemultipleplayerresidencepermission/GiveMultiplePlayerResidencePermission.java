package mc.daninelwang.givemultipleplayerresidencepermission;

import org.bukkit.plugin.java.JavaPlugin;

public final class GiveMultiplePlayerResidencePermission extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("rp").setExecutor(new rpCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
