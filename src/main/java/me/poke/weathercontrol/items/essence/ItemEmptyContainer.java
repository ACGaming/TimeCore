package me.poke.weathercontrol.items.essence;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemEmptyContainer extends Item {
	
	public ItemEmptyContainer(){
		setUnlocalizedName(Reference.WeatherControlItems.EMPTYCON.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.EMPTYCON.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
