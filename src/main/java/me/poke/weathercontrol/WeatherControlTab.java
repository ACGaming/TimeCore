package me.poke.weathercontrol;

import me.poke.weathercontrol.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeatherControlTab extends CreativeTabs {

	public WeatherControlTab() {
		super("tabWeatherControl");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.DayCapsule;
	}

}
