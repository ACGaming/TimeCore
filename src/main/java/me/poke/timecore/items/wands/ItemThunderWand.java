package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.item.Item;

public class ItemThunderWand extends Item {
	public ItemThunderWand() {
		setUnlocalizedName(Reference.WeatherControlItems.THUNDER_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDER_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
}
