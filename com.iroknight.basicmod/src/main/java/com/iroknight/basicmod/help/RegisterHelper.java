package com.Iroknight.BasicMod.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class RegisterHelper {
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + " " + block.getUnlocalizedName().substring(5));
		
	}
}
