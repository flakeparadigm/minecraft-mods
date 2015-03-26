package com.flakeparadigm.testmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.flakeparadigm.testmod.help.Reference;

public class BlockTesting extends Block {
	
	private final String NAME = "testingBlock";

	public BlockTesting() {
		super(Material.rock);
		GameRegistry.registerBlock(this, NAME);
		setUnlocalizedName(Reference.MODID + "_" + NAME);
		setCreativeTab(CreativeTabs.tabBlock);
		

		setLightLevel(0.9F);
	}
	
	public String getName() {
		return NAME;
	}
	
	// used by the renderer to control lighting and visibility of other blocks.
	// set to true because this block is opaque and occupies the entire 1x1x1 space
	// not strictly required because the default (super method) is true
	@Override
	public boolean isOpaqueCube() {
		return true;
	}
	
	// used by the renderer to control lighting and visibility of other blocks, also by
	// (eg) wall or fence to control whether the fence joins itself to this block
	// set to true because this block occupies the entire 1x1x1 space
	// not strictly required because the default (super method) is true
	@Override
	public boolean isFullCube() {
		return true;
	}
	
	// render using a BakedModel (mbe01_block_simple.json --> mbe01_block_simple_model.json)
	// not strictly required because the default (super method) is 3.
	@Override
	public int getRenderType() {
		return 3;
	}

}
