package me.poke.timecore.items.unstabcores;

import me.poke.timecore.Reference;
import me.poke.timecore.TimeCore;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemUnstabThunderCore extends Item {

	public ItemUnstabThunderCore() {
		setUnlocalizedName(Reference.WeatherControlItems.UNSTAB_THUNDER_CORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.UNSTAB_THUNDER_CORE.getRegistryName());
		setCreativeTab(TimeCore.CREATIVE_TAB);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(worldIn.isRemote){
			int timeUpdate = 200; //Every 10 sec
			if(worldIn.getWorldTime() % timeUpdate == 0){
				EntityLightningBolt lightning = new EntityLightningBolt(worldIn, entityIn.posX, entityIn.posY, entityIn.posZ, false);
				worldIn.spawnEntityInWorld(lightning);
			}
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
