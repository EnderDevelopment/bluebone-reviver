package com.enderdevelopment.plugin;

import java.util.Objects;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();
        EntityEquipment equipment = player.getEquipment();
        if (equipment == null) {
            return;
        }

        equipment.setHelmet(new ItemStack(Material.SKELETON_SKULL));
        equipment.setChestplate(createBlueArmor(Material.LEATHER_CHESTPLATE));
        equipment.setLeggings(createBlueArmor(Material.LEATHER_LEGGINGS));
        equipment.setBoots(createBlueArmor(Material.LEATHER_BOOTS));
        player.sendMessage(Component.text("You have risen as a blue skeleton!", NamedTextColor.BLUE));
    }

    private ItemStack createBlueArmor(Material material) {
        ItemStack armor = new ItemStack(material);
        LeatherArmorMeta meta = (LeatherArmorMeta) Objects.requireNonNull(armor.getItemMeta());
        meta.setColor(Color.BLUE);
        armor.setItemMeta(meta);
        return armor;
    }
}
