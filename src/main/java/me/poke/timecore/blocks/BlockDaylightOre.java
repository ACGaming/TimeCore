package me.poke.timecore.blocks;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDaylightOre extends Block{

	public BlockDaylightOre(){
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.DAYLIGHT_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.DAYLIGHT_ORE.getRegistryName());
		setHardness(2.0F);
		setCreativeTab(TimeCore.CREATIVE_TAB); //to add the item to creative tab
		setHarvestLevel("pickaxe", 3);
		setLightLevel(6);
	}
}
