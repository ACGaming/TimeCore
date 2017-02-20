package me.poke.weathercontrol.items.capsule;

import java.util.Iterator;
import java.util.List;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.world.World;

public class ItemNightCap extends Item {

	public ItemNightCap(){
		setUnlocalizedName(Reference.WeatherControlItems.NIGHTCAPSULE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.NIGHTCAPSULE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if(!worldIn.isRemote){
			if (worldIn.getWorldTime() > 13000) {
				return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
			}
			worldIn.setWorldTime(13000);
			--itemStackIn.stackSize;
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

}
