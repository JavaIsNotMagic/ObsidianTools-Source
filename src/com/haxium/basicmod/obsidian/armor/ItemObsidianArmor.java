package com.haxium.basicmod.obsidian.armor;

import net.minecraft.item.ItemArmor;
import com.haxium.basicmod.obsidian.armor.*;
import net.minecraft.item.Item;

public class ItemObsidianArmor extends ItemArmor {
	public ItemObsidianArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.canRepair = true;
		@Override
		this.setTextureName("obsidian_armor:" + name);
	}
}
 