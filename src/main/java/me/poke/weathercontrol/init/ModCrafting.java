package me.poke.weathercontrol.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static void register()
	{
		//Capsules
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EmptyCapsule), "OEO", "DGD", "OEO", 'G', Blocks.GLASS_PANE, 'O', Items.GOLD_INGOT, 'E', Items.EMERALD, 'D', Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DayCapsule), " E ", "ECE", " E ", 'C', ModItems.EmptyCapsule, 'E', ModItems.DayEss);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.NightCapsule), " E ", "ECE", " E ", 'C', ModItems.EmptyCapsule, 'E', ModItems.NightEss);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RainCapsule), " E ", "ECE", " E ", 'C', ModItems.EmptyCapsule, 'E', ModItems.RainEss);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SunCapsule), " E ", "ECE", " E ", 'C', ModItems.EmptyCapsule, 'E', ModItems.SunEss);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ThunderStormCapsule), " E ", "ECE", " E ", 'C', ModItems.EmptyCapsule, 'E', ModItems.ThunderEss);


		
		//Smelting
		GameRegistry.addSmelting(ModBlocks.ClearOre, new ItemStack(ModItems.SunEss), 0);
		GameRegistry.addSmelting(ModBlocks.CloudOre, new ItemStack(ModItems.RainEss), 0);
		GameRegistry.addSmelting(ModBlocks.MoonOre, new ItemStack(ModItems.NightEss), 0);
		GameRegistry.addSmelting(ModBlocks.SunOre, new ItemStack(ModItems.DayEss), 0);
		GameRegistry.addSmelting(ModBlocks.ThunderOre, new ItemStack(ModItems.ThunderEss), 0);
			
	}
}
