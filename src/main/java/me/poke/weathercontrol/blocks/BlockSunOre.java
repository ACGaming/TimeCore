package me.poke.weathercontrol.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;

public class BlockSunOre extends Block{

	public BlockSunOre(){
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.SUN_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.SUN_ORE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(WeatherControl.CREATIVE_TAB); //to add the item to creative tab
	}
}
