package me.poke.weathercontrol.init;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.items.capsule.ItemDayCap;
import me.poke.weathercontrol.items.capsule.ItemEmptyCap;
import me.poke.weathercontrol.items.capsule.ItemNightCap;
import me.poke.weathercontrol.items.capsule.ItemRainCap;
import me.poke.weathercontrol.items.capsule.ItemSunCap;
import me.poke.weathercontrol.items.capsule.ItemThunderStormCap;
import me.poke.weathercontrol.items.essence.ItemDayEss;
import me.poke.weathercontrol.items.essence.ItemEmptyContainer;
import me.poke.weathercontrol.items.essence.ItemNightEss;
import me.poke.weathercontrol.items.essence.ItemRainEss;
import me.poke.weathercontrol.items.essence.ItemSunEss;
import me.poke.weathercontrol.items.essence.ItemThunderEss;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Capsules
	public static Item EmptyCapsule, SunCapsule, RainCapsule, ThunderStormCapsule, DayCapsule, NightCapsule;

	//Essences
	public static Item EmptyEssenceContainer, SunEss, RainEss, ThunderEss, DayEss, NightEss;
	
	public static void init(){
		//Capsules
		EmptyCapsule = new ItemEmptyCap();
		SunCapsule = new ItemSunCap();
		RainCapsule = new ItemRainCap();
		ThunderStormCapsule = new ItemThunderStormCap();
		DayCapsule = new ItemDayCap();
		NightCapsule = new ItemNightCap();
		
		//Essences
		EmptyEssenceContainer = new ItemEmptyContainer();
		SunEss = new ItemSunEss();
		RainEss = new ItemRainEss();
		ThunderEss = new ItemThunderEss();
		DayEss = new ItemDayEss();
		NightEss = new ItemNightEss();
		
	}
	
	public static void register(){
		//Capsule
		GameRegistry.register(EmptyCapsule);
		GameRegistry.register(SunCapsule);
		GameRegistry.register(RainCapsule);
		GameRegistry.register(ThunderStormCapsule);
		GameRegistry.register(DayCapsule);
		GameRegistry.register(NightCapsule);
		
		//Essences
		GameRegistry.register(EmptyEssenceContainer);
		GameRegistry.register(SunEss);
		GameRegistry.register(RainEss);
		GameRegistry.register(ThunderEss);
		GameRegistry.register(DayEss);
		GameRegistry.register(NightEss);
	}
	
	public static void registerRenders(){
		//Capsule
		registerRender(EmptyCapsule);
		registerRender(SunCapsule);
		registerRender(RainCapsule);
		registerRender(ThunderStormCapsule);
		registerRender(DayCapsule);
		registerRender(NightCapsule);
		
		//Essences
		registerRender(EmptyEssenceContainer);
		registerRender(SunEss);
		registerRender(RainEss);
		registerRender(ThunderEss);
		registerRender(DayEss);
		registerRender(NightEss);
		
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
