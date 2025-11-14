package me.biquaternions.novillagertrades;

import me.biquaternions.novillagertrades.listener.VillagerListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoVillagerTrades extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new VillagerListener(), this);
    }

}
