package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemNightCore extends Item {
	
	public ItemNightCore(){
		setUnlocalizedName(Reference.WeatherControlItems.NIGHTCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NIGHTCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;
		player.addPotionEffect((new PotionEffect(Potion.getPotionById(15),1200,1)));
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}

}


