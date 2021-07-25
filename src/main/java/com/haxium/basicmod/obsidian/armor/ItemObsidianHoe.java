package com.haxium.basicmod.obsidian.armor;

import net.minecraft.item.ItemHoe;
import com.haxium.basicmod.obsidian.armor.*;
import net.minecraft.item.ItemTool;

public class ItemObsidianHoe extends ItemHoe {
	public ItemObsidianHoe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.setTextureName("obsidian_armor:" + name);
		this.canRepair = true;
	}
}
