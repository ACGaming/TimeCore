package me.poke.timecore.items.fragments;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemDaylightFragment extends Item {
	
	public ItemDaylightFragment(){
		setUnlocalizedName(Reference.WeatherControlItems.DAYLIGHT_FRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYLIGHT_FRAGMENT.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
