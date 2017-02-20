package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemNightEss extends Item {
	
	public ItemNightEss(){
		setUnlocalizedName(Reference.WeatherControlItems.NIGHTESS.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NIGHTESS.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}

}
