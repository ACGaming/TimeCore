package me.poke.timecore.blocks;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockThunderOre extends Block {

	public BlockThunderOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.THUNDER_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.THUNDER_ORE.getRegistryName());
		setHardness(2.0F);
		setCreativeTab(TimeCore.CREATIVE_TAB); //to add the item to creative tabà
		setHarvestLevel("pickaxe", 2);
		setLightLevel(6);
	}

}
