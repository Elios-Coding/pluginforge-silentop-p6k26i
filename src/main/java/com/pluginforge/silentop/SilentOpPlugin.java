package com.pluginforge.silentop;

import org.bukkit.plugin.java.JavaPlugin;

public final class SilentOpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SilentOp v1.0 enabled.");
        getCommand("ops").setExecutor(new OpsCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SilentOp disabled.");
    }
}
