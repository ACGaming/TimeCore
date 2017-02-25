package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemDaylightWand extends Item {
	public ItemDaylightWand() {
		setUnlocalizedName(Reference.WeatherControlItems.DAYLIGHT_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYLIGHT_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
