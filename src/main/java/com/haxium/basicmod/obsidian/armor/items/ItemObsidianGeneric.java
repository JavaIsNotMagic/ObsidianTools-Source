package com.haxium.basicmod.obsidian.armor.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class ItemObsidianGeneric extends Item {
	public ItemObsidianGeneric(String name) {
		setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("obsidian_armor:" + name);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.setCreativeTab(ObsidianArmor.tabItems);
	}
}
