package com.haxium.basicmod.obsidian.armor;

import net.minecraft.item.ItemArmor;

public class ItemObsidianArmor extends ItemArmor {
	public ItemObsidianArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.canRepair = true;
		this.setTextureName("obsidian_armor:" + name);
	}
}
 