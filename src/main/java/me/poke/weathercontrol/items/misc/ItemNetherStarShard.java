package me.poke.weathercontrol.items.misc;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemNetherStarShard extends Item {
	
	public ItemNetherStarShard(){
		setUnlocalizedName(Reference.WeatherControlItems.NETHER_SHARD.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NETHER_SHARD.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
}
