package com.flakeparadigm.testmod.common;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.flakeparadigm.testmod.help.Reference;

public class CommonProxy {

	public static Block testingBlock;

	/**
	 * Run before anything else. Read your config, create blocks, items, etc,
	 * and register them with the GameRegistry
	 */
	public void preInit(FMLPreInitializationEvent event) {
		// Blocks
		testingBlock = new BlockTesting();

		// register my Items, Entities, etc
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about.
	 * Register recipes, send FMLInterModComms messages to other mods.
	 */
	public void load(FMLInitializationEvent event) {
		// register my Recipies

		if (event.getSide() == Side.CLIENT) {

			// blocks
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			renderItem.getItemModelMesher().register(
					Item.getItemFromBlock(testingBlock), 0,
					new ModelResourceLocation(Reference.MODID + ":"
							+ ((BlockTesting) testingBlock).getName(),
							"inventory"));
		}
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	public void postInit(FMLPostInitializationEvent event) {
		// complete setup
	}

}
