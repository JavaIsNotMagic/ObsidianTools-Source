package com.haxium.basicmod.obsidian.armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class tabItems extends CreativeTabs {
  public tabItems() {
    super("ObsidianArmor Items");
  }
  
  public Item getTabIconItem() {
    return ObsidianArmor.obsidian_ingot;
  }
}
