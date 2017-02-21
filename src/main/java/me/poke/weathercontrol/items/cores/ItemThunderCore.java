package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemThunderCore extends Item {

	public ItemThunderCore(){
		setUnlocalizedName(Reference.WeatherControlItems.THUNDERCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDERCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
