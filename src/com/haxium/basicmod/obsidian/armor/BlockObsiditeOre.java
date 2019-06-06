package com.haxium.basicmod.obsidian.armor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockObsiditeOre extends Block {
	String name = "obsidite_ore";
	public BlockObsiditeOre() {
		super(Material.rock);
		setBlockName(ObsidianArmor.MODID + "_" + name);
		setBlockTextureName("obsidian_armor:" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3F);
		setResistance(7F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 3);
	}
}
