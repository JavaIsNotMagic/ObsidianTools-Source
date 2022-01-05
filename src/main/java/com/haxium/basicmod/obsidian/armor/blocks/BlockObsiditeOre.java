package com.haxium.basicmod.obsidian.armor.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.haxium.basicmod.obsidian.armor.ObsidianArmor;

public class BlockObsiditeOre extends Block {
	String name = "obsidite_ore";
	public BlockObsiditeOre() {
		super(Material.rock);
		setBlockName(ObsidianArmor.MODID + "_" + name);
		setBlockTextureName("obsidian_armor:" + name);
		setHardness(3F);
		setResistance(7F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ObsidianArmor.tabOres);
	}
}
