package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemMoonlightWand extends Item {
	public ItemMoonlightWand() {
		setUnlocalizedName(Reference.WeatherControlItems.MOONLIGHT_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.MOONLIGHT_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
		setMaxDamage(10);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		if(!worldIn.isRemote){
			if (worldIn.getWorldTime() > 13000) {
				return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
			}
			worldIn.setWorldTime(13000);
			itemStackIn.damageItem(1, playerIn);;
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
