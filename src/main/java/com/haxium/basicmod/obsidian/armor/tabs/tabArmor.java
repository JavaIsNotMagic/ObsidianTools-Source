package com.haxium.basicmod.obsidian.armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class tabArmor extends CreativeTabs {
  public tabArmor() {
    super("Obsidian Armor");
  }
  
  public Item getTabIconItem() {
    return ObsidianArmor.obsidian_leggings;
  }
}
