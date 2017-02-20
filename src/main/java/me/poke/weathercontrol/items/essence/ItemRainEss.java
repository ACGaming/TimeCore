package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemRainEss extends Item {
	
	public ItemRainEss(){
		setUnlocalizedName(Reference.WeatherControlItems.RAINESS.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.RAINESS.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}

}
