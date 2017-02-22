package me.poke.weathercontrol.items.cores;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.WeatherControl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.actors.IScheduler;

public class ItemThunderCore extends Item {

	public ItemThunderCore() {
		setUnlocalizedName(Reference.WeatherControlItems.THUNDERCORE.getUnlocalizedName());
		setRegistryName(Reference.WeatherControlItems.THUNDERCORE.getRegistryName());
		setCreativeTab(WeatherControl.CREATIVE_TAB);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityLightningBolt lightning = new EntityLightningBolt(worldIn, entityIn.posX, entityIn.posY, entityIn.posZ, false);
		int timeUpdate = 200; //Every 10 sec
		if(worldIn.getWorldTime() % timeUpdate == 0)
			worldIn.spawnEntityInWorld(lightning);
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
