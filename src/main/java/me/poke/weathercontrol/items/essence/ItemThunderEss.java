package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemThunderEss extends Item {

	public ItemThunderEss(){
		setUnlocalizedName(Reference.WeatherControlItems.THUNDERESS.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDERESS.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
