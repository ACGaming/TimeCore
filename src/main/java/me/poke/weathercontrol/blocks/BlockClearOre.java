package me.poke.weathercontrol.blocks;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockClearOre extends Block {

	public BlockClearOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.CLEAR_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.CLEAR_ORE.getRegistryName());
		setHardness(2.0F);
		setCreativeTab(WeatherControl.CREATIVE_TAB); //to add the item to creative tab
		setHarvestLevel("pickaxe", 3);
		setLightLevel(6);
	}

}
