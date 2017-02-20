package me.poke.weathercontrol.items.capsule;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ItemRainCap extends Item {

	public ItemRainCap(){
		setUnlocalizedName(Reference.WeatherControlItems.RAINCAPSULE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.RAINCAPSULE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
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
}
