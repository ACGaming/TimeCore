package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRainCore extends Item {

	public ItemRainCore(){
		setUnlocalizedName(Reference.WeatherControlItems.RAINCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.RAINCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
		EntityPlayer player = (EntityPlayer) entityIn;
		player.addPotionEffect((new PotionEffect(Potion.getPotionById(2),600,1)));
		//int timeUpdate = 200; //Every 10 sec
		//if(worldIn.getWorldTime() % timeUpdate == 0)
		//.setBlockState(entityIn.getPosition(), Blocks.FLOWING_WATER.getDefaultState());
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
