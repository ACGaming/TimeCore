package me.poke.timecore.items.fragments;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemCloudFragment extends Item {
	
	public ItemCloudFragment(){
		setUnlocalizedName(Reference.WeatherControlItems.CLOUD_FRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.CLOUD_FRAGMENT.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}

}
