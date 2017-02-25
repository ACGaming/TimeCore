package me.poke.timecore.items.misc;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemNetherStarShard extends Item {
	
	public ItemNetherStarShard(){
		setUnlocalizedName(Reference.WeatherControlItems.NETHER_SHARD.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NETHER_SHARD.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
	
}
