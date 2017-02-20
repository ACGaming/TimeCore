package me.poke.weathercontrol.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static void register()
	{
		//Capsule
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EmptyCapsule), " I ", "IGI", " I ", 'I', Items.IRON_INGOT, 'G', Blocks.GLASS);
		
		
		//Smelting
		GameRegistry.addSmelting(ModBlocks.ClearOre, new ItemStack(ModItems.SunEss), 0);
		GameRegistry.addSmelting(ModBlocks.CloudOre, new ItemStack(ModItems.RainEss), 0);
		GameRegistry.addSmelting(ModBlocks.MoonOre, new ItemStack(ModItems.NightEss), 0);
		GameRegistry.addSmelting(ModBlocks.SunOre, new ItemStack(ModItems.DayEss), 0);
		GameRegistry.addSmelting(ModBlocks.ThunderOre, new ItemStack(ModItems.ThunderEss), 0);
			
	}
}
