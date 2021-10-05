package com.github.codedoctorde.itemmodsaddon;

import dev.linwood.itemmods.ItemMods;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author CodeDoctorDE
 */
public class ExampleMods extends JavaPlugin {
    private ExampleItemModsAddon addon = new ExampleItemModsAddon();

    @Override
    public void onEnable() {
        ItemMods.getPackManager().registerPack(addon);
    }

    @Override
    public void onDisable() {
        ItemMods.getPackManager().unregisterPack("example_pack");
    }
}
