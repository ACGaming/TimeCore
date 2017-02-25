package me.poke.timecore.items.stabcores;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;

public class ItemStabSunlightCore extends Item {

	public ItemStabSunlightCore(){
		setUnlocalizedName(Reference.WeatherControlItems.STAB_SUNLIGHT_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.STAB_SUNLIGHT_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		int time = 400 + itemRand.nextInt(1000) * 20;
		if (!worldIn.isRemote) {
			if (worldIn.getWorldInfo().isRaining()){
				WorldInfo worldInfo = worldIn.getWorldInfo();
				worldInfo.setCleanWeatherTime(time);
				worldInfo.setRainTime(0);
				worldInfo.setThunderTime(0);
				worldInfo.setRaining(false);
				worldInfo.setThundering(false);
				--itemStackIn.stackSize;
			}
		}
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
