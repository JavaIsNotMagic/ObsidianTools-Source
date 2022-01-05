package com.haxium.basicmod.obsidian.armor.items;

import net.minecraft.item.ItemPickaxe;
import com.haxium.basicmod.obsidian.armor.*;
import net.minecraft.item.ItemTool;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class ItemObsidianPickaxe extends ItemPickaxe {
	public ItemObsidianPickaxe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		this.setTextureName("obsidian_armor:" + name);
		this.canRepair = true;
		this.setCreativeTab(ObsidianArmor.tabTools);
	}
}
