package me.poke.timecore.items.stabcores;

import java.util.List;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ItemStabCloudCore extends Item {

	public ItemStabCloudCore(){
		setUnlocalizedName(Reference.WeatherControlItems.STAB_CLOUD_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.STAB_CLOUD_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
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
				--itemStackIn.stackSize;
			}
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("Make it rain!");
	}
	
	
}
