package me.poke.weathercontrol.blocks;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMoonOre extends Block {

	public BlockMoonOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.MOON_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.MOON_ORE.getRegistryName());
		setHardness(4.0F);
		setCreativeTab(WeatherControl.CREATIVE_TAB); //to add the item to creative tab
		setHarvestLevel("pickaxe", 3);
	}

}
