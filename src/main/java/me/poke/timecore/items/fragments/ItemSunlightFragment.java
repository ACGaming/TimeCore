package me.poke.timecore.items.fragments;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemSunlightFragment extends Item {

	public ItemSunlightFragment(){
		setUnlocalizedName(Reference.WeatherControlItems.SUNLIGHT_FRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.SUNLIGHT_FRAGMENT.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
