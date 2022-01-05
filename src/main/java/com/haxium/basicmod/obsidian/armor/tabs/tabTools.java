package com.haxium.basicmod.obsidian.armor.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class tabTools extends CreativeTabs {
  public tabTools() {
    super("ObsidianArmor Tools");
  }
  
  public Item getTabIconItem() {
    return ObsidianArmor.obsidian_axe;
  }
}
