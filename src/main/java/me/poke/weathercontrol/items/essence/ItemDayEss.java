package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemDayEss extends Item {
	
	public ItemDayEss(){
		setUnlocalizedName(Reference.WeatherControlItems.DAYESS.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYESS.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
