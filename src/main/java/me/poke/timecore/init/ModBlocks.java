package me.poke.timecore.init;

import me.poke.timecore.blocks.BlockCloudOre;
import me.poke.timecore.blocks.BlockConcentrator;
import me.poke.timecore.blocks.BlockDaylightOre;
import me.poke.timecore.blocks.BlockMoonlightOre;
import me.poke.timecore.blocks.BlockSunlightOre;
import me.poke.timecore.blocks.BlockThunderOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block SunOre, CloudOre, MoonOre, ClearOre, ThunderOre, Concentrator;

	
	public static void init(){
		SunOre = new BlockDaylightOre();
		CloudOre = new BlockCloudOre();
		MoonOre = new BlockMoonlightOre();
		ClearOre = new BlockSunlightOre();
		ThunderOre = new BlockThunderOre();
		Concentrator = new BlockConcentrator();
		
	}
	
	
	public static void register(){
		registerBlock(SunOre);
		registerBlock(CloudOre);
		registerBlock(MoonOre);
		registerBlock(ClearOre);
		registerBlock(ThunderOre);
		registerBlock(Concentrator);
		
	}
	
	public static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);		
	}
	
	public static void registerRenders(){
		registerRender(SunOre);
		registerRender(CloudOre);
		registerRender(MoonOre);
		registerRender(ClearOre);
		registerRender(ThunderOre);
		registerRender(Concentrator);
		
	}
	
	public static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
