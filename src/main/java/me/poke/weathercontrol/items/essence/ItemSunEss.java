package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemSunEss extends Item {

	public ItemSunEss(){
		setUnlocalizedName(Reference.WeatherControlItems.SUNESS.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.SUNESS.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
