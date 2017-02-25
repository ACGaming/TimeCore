package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemMoonlightWand extends Item {
	public ItemMoonlightWand() {
		setUnlocalizedName(Reference.WeatherControlItems.MOONLIGHT_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.MOONLIGHT_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
