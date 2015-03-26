package com.flakeparadigm.testmod.common;

import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.flakeparadigm.testmod.help.Reference;

public class BlockTorchest extends BlockChest {
	
	private final String NAME = "torchestBlock";

	public BlockTorchest() {
		super(0);
		GameRegistry.registerBlock(this, NAME);
		setUnlocalizedName(Reference.MODID + "_" + NAME);
		setCreativeTab(CreativeTabs.tabBlock);
		

		setLightLevel(0.9F);
	}
	
	public String getName() {
		return NAME;
	}

}
