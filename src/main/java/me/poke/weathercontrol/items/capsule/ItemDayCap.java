package me.poke.weathercontrol.items.capsule;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemDayCap extends Item {
	
	public ItemDayCap(){
		setUnlocalizedName(Reference.WeatherControlItems.DAYCAPSULE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.DAYCAPSULE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if(!worldIn.isRemote){
			if (worldIn.getWorldTime() < 13000) {
				return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
			}
			worldIn.setWorldTime(0);
			--itemStackIn.stackSize;
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
