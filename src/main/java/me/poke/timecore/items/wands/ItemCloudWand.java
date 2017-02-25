package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemCloudWand extends Item {
	public ItemCloudWand() {
		setUnlocalizedName(Reference.WeatherControlItems.CLOUD_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.CLOUD_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
