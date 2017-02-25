package me.poke.timecore;

import me.poke.timecore.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TimeCoreTab extends CreativeTabs {

	public TimeCoreTab() {
		super("tabTimeCore");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.RainCore;
	}

}
