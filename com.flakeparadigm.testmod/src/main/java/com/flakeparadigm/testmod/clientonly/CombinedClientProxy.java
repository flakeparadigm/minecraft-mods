package com.flakeparadigm.testmod.clientonly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.flakeparadigm.testmod.common.BlockTesting;
import com.flakeparadigm.testmod.common.CommonProxy;
import com.flakeparadigm.testmod.help.Reference;

public class CombinedClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void load(FMLInitializationEvent event) {
		super.load(event);
		
		// blocks
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

		// testingBlock
		renderItem.getItemModelMesher()
				.register(
						Item.getItemFromBlock(super.testingBlock),
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ ((BlockTesting) super.testingBlock).getName(),
								"inventory"));

		renderItem.getItemModelMesher().register(
				Item.getItemFromBlock(super.torchestBlock),
					0,
					new ModelResourceLocation(
							"chest",
							"inventory"
					)
			);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

}
