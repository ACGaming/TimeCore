package me.poke.timecore.blocks;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCloudOre extends Block {

	public BlockCloudOre() {
		super(Material.CLOTH);
		setUnlocalizedName(Reference.WeatherControlBlocks.CLOUD_ORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlBlocks.CLOUD_ORE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(TimeCore.CREATIVE_TAB); //to add the item to creative tab
	}

}
