package me.poke.timecore.items.unstabcores;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemUnstabSunCore extends Item {

	public ItemUnstabSunCore(){
		setUnlocalizedName(Reference.WeatherControlItems.UNSTAB_SUNLIGHT_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.UNSTAB_SUNLIGHT_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(!entityIn.isWet()) //Prevent rain spam
			entityIn.setFire(5);
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
