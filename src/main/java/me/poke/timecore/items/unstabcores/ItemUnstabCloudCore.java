package me.poke.timecore.items.unstabcores;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemUnstabCloudCore extends Item {

	public ItemUnstabCloudCore(){
		setUnlocalizedName(Reference.WeatherControlItems.UNSTAB_CLOUD_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.UNSTAB_CLOUD_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
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
