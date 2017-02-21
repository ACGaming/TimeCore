package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemNightCore extends Item {
	
	public ItemNightCore(){
		setUnlocalizedName(Reference.WeatherControlItems.NIGHTCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NIGHTCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
