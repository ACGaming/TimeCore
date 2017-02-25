package me.poke.timecore.items.fragments;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemMoonlightFragment extends Item {
	
	public ItemMoonlightFragment(){
		setUnlocalizedName(Reference.WeatherControlItems.MOONLIGHT_FRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.MOONLIGHT_FRAGMENT.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}

}
