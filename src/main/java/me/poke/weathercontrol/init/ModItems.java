package me.poke.weathercontrol.init;

import me.poke.weathercontrol.Reference;
import me.poke.weathercontrol.items.capsule.ItemDayCap;
import me.poke.weathercontrol.items.capsule.ItemEmptyCap;
import me.poke.weathercontrol.items.capsule.ItemNightCap;
import me.poke.weathercontrol.items.capsule.ItemRainCap;
import me.poke.weathercontrol.items.capsule.ItemSunCap;
import me.poke.weathercontrol.items.capsule.ItemThunderStormCap;
import me.poke.weathercontrol.items.cores.ItemDayCore;
import me.poke.weathercontrol.items.cores.ItemNightCore;
import me.poke.weathercontrol.items.cores.ItemRainCore;
import me.poke.weathercontrol.items.cores.ItemSunCore;
import me.poke.weathercontrol.items.cores.ItemThunderCore;
import me.poke.weathercontrol.items.essence.ItemDayEss;
import me.poke.weathercontrol.items.essence.ItemNightEss;
import me.poke.weathercontrol.items.essence.ItemRainEss;
import me.poke.weathercontrol.items.essence.ItemSunEss;
import me.poke.weathercontrol.items.essence.ItemThunderEss;
import me.poke.weathercontrol.items.misc.ItemNetherStarShard;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Capsules
	public static Item EmptyCapsule, SunCapsule, RainCapsule, ThunderStormCapsule, DayCapsule, NightCapsule;

	//Essences
	public static Item EmptyEssenceContainer, SunEss, RainEss, ThunderEss, DayEss, NightEss;
	
	//Cores
	public static Item SunCore, RainCore, ThunderCore, DayCore, NightCore;
	
	//Misc
	public static Item NetherStarShard;
	
	public static void init(){
		//Capsules
		EmptyCapsule = new ItemEmptyCap();
		SunCapsule = new ItemSunCap();
		RainCapsule = new ItemRainCap();
		ThunderStormCapsule = new ItemThunderStormCap();
		DayCapsule = new ItemDayCap();
		NightCapsule = new ItemNightCap();
		
		//Essences
		SunEss = new ItemSunEss();
		RainEss = new ItemRainEss();
		ThunderEss = new ItemThunderEss();
		DayEss = new ItemDayEss();
		NightEss = new ItemNightEss();
		
		//Cores
		SunCore = new ItemSunCore();
		RainCore = new ItemRainCore();
		ThunderCore = new ItemThunderCore();
		DayCore = new ItemDayCore();
		NightCore = new ItemNightCore();
		
		//Misc
		NetherStarShard = new ItemNetherStarShard();
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
		GameRegistry.register(SunEss);
		GameRegistry.register(RainEss);
		GameRegistry.register(ThunderEss);
		GameRegistry.register(DayEss);
		GameRegistry.register(NightEss);
		
		//Cores
		GameRegistry.register(SunCore);
		GameRegistry.register(RainCore);
		GameRegistry.register(ThunderCore);
		GameRegistry.register(DayCore);
		GameRegistry.register(NightCore);
		
		//Misc
		GameRegistry.register(NetherStarShard);
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
		registerRender(SunEss);
		registerRender(RainEss);
		registerRender(ThunderEss);
		registerRender(DayEss);
		registerRender(NightEss);
		
		//Cores
		registerRender(SunCore);
		registerRender(RainCore);
		registerRender(ThunderCore);
		registerRender(DayCore);
		registerRender(NightCore);
		
		//Misc
		registerRender(NetherStarShard);
		
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
