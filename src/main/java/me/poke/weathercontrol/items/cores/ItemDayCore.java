package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemDayCore extends Item {
	
	public ItemDayCore(){
		setUnlocalizedName(Reference.WeatherControlItems.DAYCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
