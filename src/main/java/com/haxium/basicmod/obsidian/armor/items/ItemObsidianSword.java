package com.haxium.basicmod.obsidian.armor.items;

import net.minecraft.item.ItemSword;
import com.haxium.basicmod.obsidian.armor.*;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class ItemObsidianSword extends ItemSword {
	public ItemObsidianSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(ObsidianArmor.MODID + "_" + name);
		setTextureName("obsidian_armor:" + name);
		this.canRepair = true;
		this.setCreativeTab(ObsidianArmor.tabTools);
	}
};
