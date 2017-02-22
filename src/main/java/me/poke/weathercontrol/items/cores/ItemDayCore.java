package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDayCore extends Item {
	
	public ItemDayCore(){
		setUnlocalizedName(Reference.WeatherControlItems.DAYCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(!entityIn.isWet()) //Prevent rain spam
			entityIn.setFire(5);
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
