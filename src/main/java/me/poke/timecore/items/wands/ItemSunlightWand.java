package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemSunlightWand extends Item {
	public ItemSunlightWand() {
		setUnlocalizedName(Reference.WeatherControlItems.SUNLIGHT_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.SUNLIGHT_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
