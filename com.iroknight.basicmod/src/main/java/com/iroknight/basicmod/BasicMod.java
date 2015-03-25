package com.Iroknight.BasicMod;

import com.Iroknight.BasicMod.help.Reference;
import com.Iroknight.BasicMod.help.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class BasicMod
{
    
    public static Block liveOre;
    
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    	liveOre = new BlockLiveOre();
    	
    	RegisterHelper.registerBlock(liveOre);
    	
    }
}
