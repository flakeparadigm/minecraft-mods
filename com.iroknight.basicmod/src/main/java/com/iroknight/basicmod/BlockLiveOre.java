package com.Iroknight.BasicMod;

import com.Iroknight.BasicMod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
