package me.poke.timecore.items.wands;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import me.poke.timecore.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ItemCloudWand extends Item {
	public ItemCloudWand() {
		setUnlocalizedName(Reference.WeatherControlItems.CLOUD_WAND.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.CLOUD_WAND.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
		setMaxDamage(10);
		setMaxStackSize(1);
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
				worldInfo.setThundering(false);
				itemStackIn.damageItem(1, playerIn);
			}
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
