package me.poke.weathercontrol.items.capsule;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemEmptyCap extends Item {
	
	public ItemEmptyCap(){
		setUnlocalizedName(Reference.WeatherControlItems.EMPTYCAPSULE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.EMPTYCAPSULE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
