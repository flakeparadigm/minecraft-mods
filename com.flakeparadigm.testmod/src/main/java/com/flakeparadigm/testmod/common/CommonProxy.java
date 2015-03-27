package com.flakeparadigm.testmod.common;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.flakeparadigm.testmod.help.Reference;

public class CommonProxy {

	public static Block testingBlock;
	public static Block torchestBlock;

	/**
	 * Run before anything else. Read your config, create blocks, items, etc,
	 * and register them with the GameRegistry
	 */
	public void preInit(FMLPreInitializationEvent event) {
		// Blocks
		testingBlock = new BlockTesting();
		torchestBlock = new BlockTorchest();

		// register my Items, Entities, etc
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about.
	 * Register recipes, send FMLInterModComms messages to other mods.
	 */
	public void load(FMLInitializationEvent event) {
		// register my Recipies
		
		// Testing Block
		GameRegistry.addRecipe(new ItemStack(testingBlock, 1), new Object[] {
			// shape
    		" T ",
    		"TCT",
    		" T ",
    		// composition
    		'C', Blocks.cobblestone,
    		'T', Blocks.torch
		});
		
		// Torchest Block
		GameRegistry.addRecipe(new ItemStack(torchestBlock, 1), new Object[] {
			// shape
    		" T ",
    		"TCT",
    		" T ",
    		// composition
    		'C', Blocks.chest,
    		'T', Blocks.torch
		});
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	public void postInit(FMLPostInitializationEvent event) {
		// complete setup
	}

}
