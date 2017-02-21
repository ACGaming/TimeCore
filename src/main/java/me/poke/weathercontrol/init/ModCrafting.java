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
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DayCapsule), ModItems.NetherStarShard, ModItems.DayCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NightCapsule), ModItems.NetherStarShard, ModItems.NightCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.RainCapsule), ModItems.NetherStarShard, ModItems.RainCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SunCapsule), ModItems.NetherStarShard, ModItems.SunCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ThunderStormCapsule), ModItems.NetherStarShard, ModItems.ThunderCore);

		
		//Smelting
		GameRegistry.addSmelting(ModBlocks.ClearOre, new ItemStack(ModItems.SunEss), 0);
		GameRegistry.addSmelting(ModBlocks.CloudOre, new ItemStack(ModItems.RainEss), 0);
		GameRegistry.addSmelting(ModBlocks.MoonOre, new ItemStack(ModItems.NightEss), 0);
		GameRegistry.addSmelting(ModBlocks.SunOre, new ItemStack(ModItems.DayEss), 0);
		GameRegistry.addSmelting(ModBlocks.ThunderOre, new ItemStack(ModItems.ThunderEss), 0);
		
		//Cores
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DayCore), " E ", "ESE", " E ", 'E', ModItems.DayEss, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.NightCore), " E ", "ESE", " E ", 'E', ModItems.NightEss, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RainCore), " E ", "ESE", " E ", 'E', ModItems.RainEss, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SunCore), " E ", "ESE", " E ", 'E', ModItems.SunEss, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ThunderCore), " E ", "ESE", " E ", 'E', ModItems.ThunderEss, 'S', ModItems.NetherStarShard);
		
		//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NetherStarShard, 9), Items.NETHER_STAR);
		GameRegistry.addShapedRecipe(new ItemStack(Items.NETHER_STAR), "SSS", "SSS", "SSS", 'S', ModItems.NetherStarShard);
			
	}
}
