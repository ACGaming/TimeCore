package me.poke.weathercontrol.init;

import me.poke.weathercontrol.blocks.BlockCloudOre;
import me.poke.weathercontrol.blocks.BlockMoonOre;
import me.poke.weathercontrol.blocks.BlockClearOre;
import me.poke.weathercontrol.blocks.BlockSunOre;
import me.poke.weathercontrol.blocks.BlockThunderOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block SunOre, CloudOre, MoonOre, ClearOre, ThunderOre;

	
	public static void init(){
		SunOre = new BlockSunOre();
		CloudOre = new BlockCloudOre();
		MoonOre = new BlockMoonOre();
		ClearOre = new BlockClearOre();
		ThunderOre = new BlockThunderOre();
		
	}
	
	
	public static void register(){
		registerBlock(SunOre);
		registerBlock(CloudOre);
		registerBlock(MoonOre);
		registerBlock(ClearOre);
		registerBlock(ThunderOre);
		
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
		
	}
	
	public static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
