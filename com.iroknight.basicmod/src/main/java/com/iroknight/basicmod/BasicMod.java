package com.iroknight.basicmod;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.iroknight.basicmod.help.Reference;
import com.iroknight.basicmod.help.RegisterHelper;

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
