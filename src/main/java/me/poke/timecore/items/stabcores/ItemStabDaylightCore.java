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

public class ItemStabDaylightCore extends Item {
	
	public ItemStabDaylightCore(){
		setUnlocalizedName(Reference.WeatherControlItems.STAB_DAYLIGHT_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.STAB_DAYLIGHT_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
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
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("The dawn has arrived");
	}
}
