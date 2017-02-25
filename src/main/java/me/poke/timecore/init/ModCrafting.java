package me.poke.timecore.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static void register()
	{
		//Capsules CHANGER ITEM
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EmptyCapsule), "OEO", "DGD", "OEO", 'G', Blocks.GLASS_PANE, 'O', Items.GOLD_INGOT, 'E', Items.EMERALD, 'D', Items.DIAMOND);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StabDaylightCore), ModItems.EmptyCapsule, ModItems.DayCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StabMoonlightCore), ModItems.EmptyCapsule, ModItems.NightCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StabCloudCore), ModItems.EmptyCapsule, ModItems.RainCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StabSunlightCore), ModItems.EmptyCapsule, ModItems.SunCore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StabThunderCore), ModItems.EmptyCapsule, ModItems.ThunderCore);

		
		//Smelting
		GameRegistry.addSmelting(ModBlocks.ClearOre, new ItemStack(ModItems.SunlightFragment), 0);
		GameRegistry.addSmelting(ModBlocks.CloudOre, new ItemStack(ModItems.CloudFragment), 0);
		GameRegistry.addSmelting(ModBlocks.MoonOre, new ItemStack(ModItems.MoonlightFragment), 0);
		GameRegistry.addSmelting(ModBlocks.SunOre, new ItemStack(ModItems.DaylightFragment), 0);
		GameRegistry.addSmelting(ModBlocks.ThunderOre, new ItemStack(ModItems.ThunderFragment), 0);
		
		//Cores
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DayCore), " E ", "ESE", " E ", 'E', ModItems.DaylightFragment, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.NightCore), " E ", "ESE", " E ", 'E', ModItems.MoonlightFragment, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RainCore), " E ", "ESE", " E ", 'E', ModItems.CloudFragment, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SunCore), " E ", "ESE", " E ", 'E', ModItems.SunlightFragment, 'S', ModItems.NetherStarShard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ThunderCore), " E ", "ESE", " E ", 'E', ModItems.ThunderFragment, 'S', ModItems.NetherStarShard);
		
		//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NetherStarShard, 9), Items.NETHER_STAR);
		GameRegistry.addShapedRecipe(new ItemStack(Items.NETHER_STAR), "SSS", "SSS", "SSS", 'S', ModItems.NetherStarShard);
		
		//Wands
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EmptyWand), "  N", "DG ","ED ", 'N', Items.NETHER_STAR, 'G', Blocks.GOLD_BLOCK, 'D', Blocks.DIAMOND_BLOCK, 'E', Items.EMERALD);
			
	}
}
