package me.poke.timecore.items.misc;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemEmptyCap extends Item {
	
	public ItemEmptyCap(){
		setUnlocalizedName(Reference.WeatherControlItems.EMPTY_CAPSULE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.EMPTY_CAPSULE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
