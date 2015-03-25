package com.iroknight.basicmod.help;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterHelper {
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + " " + block.getUnlocalizedName().substring(5));
		
	}
}
