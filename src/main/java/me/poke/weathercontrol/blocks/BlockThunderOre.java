package me.poke.weathercontrol.blocks;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockThunderOre extends Block {

	public BlockThunderOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.THUNDER_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.THUNDER_ORE.getRegistryName());
		setHardness(3.0F);
		setCreativeTab(WeatherControl.CREATIVE_TAB); //to add the item to creative tabà
		setHarvestLevel("pickaxe", 2);
	}

}
