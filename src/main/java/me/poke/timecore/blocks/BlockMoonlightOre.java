package me.poke.timecore.blocks;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMoonlightOre extends Block {

	public BlockMoonlightOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.WeatherControlBlocks.MOONLIGHT_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.MOONLIGHT_ORE.getRegistryName());
		setHardness(2.0F);
		setCreativeTab(TimeCore.CREATIVE_TAB); //to add the item to creative tab
		setHarvestLevel("pickaxe", 3);
		setLightLevel(2);
	}
}
