package com.haxium.basicmod.obsidian.armor;

import net.minecraft.item.ItemAxe;
import com.haxium.basicmod.obsidian.armor.*;
import net.minecraft.item.ItemTool;

public class ItemObsidianAxe extends ItemAxe {
	public ItemObsidianAxe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.setTextureName("obsidian_armor:" + name);
		this.canRepair = true;
	}
}
