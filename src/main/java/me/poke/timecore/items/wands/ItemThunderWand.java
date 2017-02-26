package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ItemThunderWand extends Item {
	public ItemThunderWand() {
		setUnlocalizedName(Reference.WeatherControlItems.THUNDER_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDER_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
		setMaxDamage(10);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		int time = 400 + itemRand.nextInt(1000) * 20;
		if (!worldIn.isRemote) {
			if (!worldIn.getWorldInfo().isRaining()){
				WorldInfo worldInfo = worldIn.getWorldInfo();
			    worldInfo.setCleanWeatherTime(0);
			    worldInfo.setRainTime(time);
			    worldInfo.setThunderTime(time);
			    worldInfo.setRaining(true);
			    worldInfo.setThundering(true);
				itemStackIn.damageItem(1, playerIn);
			}
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}