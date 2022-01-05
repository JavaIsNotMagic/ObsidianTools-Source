package com.haxium.basicmod.obsidian.armor.items;

import net.minecraft.item.ItemArmor;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class ItemObsidianArmor extends ItemArmor {
	public ItemObsidianArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.canRepair = true;
		this.setTextureName("obsidian_armor:" + name);
		this.setCreativeTab(ObsidianArmor.tabArmor);
	}
}
 