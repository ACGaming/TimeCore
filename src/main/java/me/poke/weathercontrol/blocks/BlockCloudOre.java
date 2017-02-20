package me.poke.weathercontrol.blocks;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCloudOre extends Block {

	public BlockCloudOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.CLOUD_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.CLOUD_ORE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(WeatherControl.CREATIVE_TAB); //to add the item to creative tab
	}

}
