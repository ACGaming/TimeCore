package me.poke.timecore.items.fragments;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemThunderFragment extends Item {

	public ItemThunderFragment(){
		setUnlocalizedName(Reference.WeatherControlItems.THUNDER_FRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDER_FRAGMENT.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
