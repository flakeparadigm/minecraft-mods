package com.iroknight.basicmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.iroknight.basicmod.help.Reference;

public class BlockLiveOre extends Block {
	
	public BlockLiveOre() {
		super(Material.rock);
		setBlockName("liveOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setLightLevel(1);
		this.setLightOpacity(0);
		this.setHardness(1);
		this.setResistance(1);
		
	}
	
}
