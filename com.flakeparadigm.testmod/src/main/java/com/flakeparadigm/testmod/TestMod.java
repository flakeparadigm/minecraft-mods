package com.flakeparadigm.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.flakeparadigm.testmod.common.CommonProxy;
import com.flakeparadigm.testmod.help.Reference;

@Mod(modid = Reference.MODID, name = Reference.VERSION, version = Reference.VERSION)
public class TestMod {

	// Mod class instance
	@Mod.Instance(Reference.MODID)
	public static TestMod instance;
	
	// Proxy
	// If the mod is being clientSide, initialize to a new CombinedClientProxy,
	// if it's on a dedicated server, then initialize as a DedicatedServerProxy
	@SidedProxy(clientSide = Reference.GROUPID+'.'+Reference.MODID+".clientonly.CombinedClientProxy",
			serverSide = Reference.GROUPID+'.'+Reference.MODID+".serveronly.DedicatedServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.load(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
