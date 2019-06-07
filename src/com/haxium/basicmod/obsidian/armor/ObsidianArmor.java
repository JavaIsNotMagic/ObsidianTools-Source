package com.haxium.basicmod.obsidian.armor;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.haxium.basicmod.obsidian.armor.ItemObsidianGeneric;
import com.haxium.basicmod.obsidian.armor.ItemObsidianArmor;
@Mod(modid = ObsidianArmor.MODID, version = ObsidianArmor.VERSION, name = ObsidianArmor.NAME, useMetadata = true)
public class ObsidianArmor {
	public static final String MODID = "obsidian_armor";
	public static final String VERSION = "1.7.10-Stable-1.1.0.1";
	public static final String NAME = "HaxCraft Obsidian Edition";
	//tools
	public static Item obsidian_pickaxe;
	public static Item obsidian_sword;
	public static Item obsidian_axe;
	public static Item obsidian_hoe;
	public static Item obsidian_ingot;
	ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 3, 4500, 10.1F, 4.5F, 10);
	//Generic Items
	public static Item obsidian_dust;
	//armor
	public static Item obsidian_helmet;
	public static Item obsidian_chest;
	public static Item obsidian_leggings;
	public static Item obsidian_boots;
	ArmorMaterial hardened_obsidian = EnumHelper.addArmorMaterial("hardened_obsidian", 20, new int[] {3, 7, 6, 3}, 25);
	//Ores
	public static Block obsidite_ore;
	//Event Handlers
	ObsidianArmorEventHandler handler = new ObsidianArmorEventHandler();
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Generic Items
		obsidian_ingot = new ItemObsidianGeneric("obsidian_ingot");
		obsdidian_dust = new ItemObsidianGeneric("obsdian_dust");
		GameRegistry.registerItem(obsdian_dust, "ObsidianDust");
		GameRegistry.registerItem(obsidian_ingot, "ObsidianIngot");
		//tools
		obsidian_pickaxe = new ItemObsidianPickaxe(obsidian, "obsidian_pickaxe");
		obsidian_sword = new ItemObsidianSword(obsidian, "obsidian_sword");
		obsidian_axe = new ItemObsidianAxe(obsidian, "obsidian_axe");
		obsidian_hoe = new ItemObsidianHoe(obsidian, "obsidian_hoe");
		GameRegistry.registerItem(obsidian_sword, "ObsidianSword");
		GameRegistry.registerItem(obsidian_pickaxe, "ObsidianPickaxe");
		GameRegistry.registerItem(obsidian_hoe, "ObsidianHoe");
		GameRegistry.registerItem(obsidian_axe, "ObsidianAxe");
		//Armor
		obsidian_boots =  new ItemObsidianArmor(hardened_obsidian, 3, "obsidian_boots");
		obsidian_helmet = new ItemObsidianArmor(hardened_obsidian, 0, "obsidian_helmet");
		obsidian_chest = new ItemObsidianArmor(hardened_obsidian, 1, "obsidian_chest");
		obsidian_leggings = new ItemObsidianArmor(hardened_obsidian, 2, "obsidian_leggings");
		GameRegistry.registerItem(obsidian_helmet, "ObsidianHelmet");
		GameRegistry.registerItem(obsidian_chest, "ObsidianChestplate");
		GameRegistry.registerItem(obsidian_leggings, "ObsidianLeggings");
		GameRegistry.registerItem(obsidian_boots, "ObsidianBoots");
		//Ores
		obsidite_ore = new BlockObsiditeOre();
		GameRegistry.registerBlock(obsidite_ore, "ObsiditeOre");
		//OreDict
		OreDictionary.registerOre("ingotObsidian", new ItemStack(obsidian_ingot));
		//Generation Handlers
		GameRegistry.registerWorldGenerator(handler, 0);
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(Items.apple, 9),
				"XXX",
				"XXX",
				"XXX",
				'X', Blocks.leaves
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_ingot, 9),
				"X",
				'X', Blocks.obsidian
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_pickaxe),
				"ABC",
				" E ",
				" H ",
				'A', ObsidianArmor.obsidian_ingot, 'B', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot,  'E', Items.stick, 'H', Items.stick
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_sword),
				" B ",
				" E ",
				" H ",
				'B', ObsidianArmor.obsidian_ingot, 'E', ObsidianArmor.obsidian_ingot, 'H', Items.stick
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_axe),
				       " BC",
				       " EF",
				       " H ",
				       'B', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'E', Items.stick, 'F', ObsidianArmor.obsidian_ingot, 'H', Items.stick
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_hoe),
				       " BC",
				       " E ",
				       " H ",
				       'B', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'E', Items.stick, 'H', Items.stick
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_helmet),
				"ABC",
				"D F",
				'A', ObsidianArmor.obsidian_ingot, 'B', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'D', ObsidianArmor.obsidian_ingot, 'F', ObsidianArmor.obsidian_ingot
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_chest),
				"A C",
				"DEF",
				"GHI",
				'A', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'D', ObsidianArmor.obsidian_ingot, 'E', ObsidianArmor.obsidian_ingot, 'F', ObsidianArmor.obsidian_ingot, 'G', ObsidianArmor.obsidian_ingot, 'H', ObsidianArmor.obsidian_ingot, 'I', ObsidianArmor.obsidian_ingot
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_leggings),
				"ABC",
				"D F",
				"G I",
				'A', ObsidianArmor.obsidian_ingot, 'B', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'D', ObsidianArmor.obsidian_ingot, 'F', ObsidianArmor.obsidian_ingot, 'G', ObsidianArmor.obsidian_ingot, 'I', ObsidianArmor.obsidian_ingot
		);
		GameRegistry.addRecipe(new ItemStack(ObsidianArmor.obsidian_boots),
				"A C",
				"D F",
				'A', ObsidianArmor.obsidian_ingot, 'C', ObsidianArmor.obsidian_ingot, 'D', ObsidianArmor.obsidian_ingot, 'F', ObsidianArmor.obsidian_ingot
		);
		//Smelting Recipes
		GameRegistry.addSmelting(ObsidianArmor.obsidite_ore, new ItemStack(ObsidianArmor.obsidian_ingot), 5F);
		GameRegistry.addSmelting(ObsidianArmor.osbidian_dust, new ItemStack(ObsdianArmor.obsdian_ingot, 2), 5F);
	}
}
