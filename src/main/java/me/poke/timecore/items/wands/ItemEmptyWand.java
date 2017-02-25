package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemEmptyWand extends Item {
	public ItemEmptyWand() {
		setUnlocalizedName(Reference.WeatherControlItems.EMPTY_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.EMPTY_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
