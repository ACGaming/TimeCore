package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.item.Item;

public class ItemSunCore extends Item {

	public ItemSunCore(){
		setUnlocalizedName(Reference.WeatherControlItems.SUNCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.SUNCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
}
