package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemRainCore extends Item {

	public ItemRainCore(){
		setUnlocalizedName(Reference.WeatherControlItems.RAINCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.RAINCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
