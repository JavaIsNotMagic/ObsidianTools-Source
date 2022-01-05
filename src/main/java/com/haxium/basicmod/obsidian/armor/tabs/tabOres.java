package com.haxium.basicmod.obsidian.armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class tabOres extends CreativeTabs {
  public tabOres() {
    super("ObsidianArmor Ores");
  }
  
  public Item getTabIconItem() {
    return Items.coal;
  }
}
