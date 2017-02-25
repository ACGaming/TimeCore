package me.poke.timecore.init;

import me.poke.timecore.Reference;
import me.poke.timecore.items.fragments.ItemCloudFragment;
import me.poke.timecore.items.fragments.ItemDaylightFragment;
import me.poke.timecore.items.fragments.ItemMoonlightFragment;
import me.poke.timecore.items.fragments.ItemSunlightFragment;
import me.poke.timecore.items.fragments.ItemThunderFragment;
import me.poke.timecore.items.misc.ItemEmptyCap;
import me.poke.timecore.items.misc.ItemNetherStarShard;
import me.poke.timecore.items.stabcores.ItemStabCloudCore;
import me.poke.timecore.items.stabcores.ItemStabDaylightCore;
import me.poke.timecore.items.stabcores.ItemStabMoonlightCore;
import me.poke.timecore.items.stabcores.ItemStabSunlightCore;
import me.poke.timecore.items.stabcores.ItemStabThunderCore;
import me.poke.timecore.items.unstabcores.ItemUnstabCloudCore;
import me.poke.timecore.items.unstabcores.ItemUnstabDayCore;
import me.poke.timecore.items.unstabcores.ItemUnstabMoonlightCore;
import me.poke.timecore.items.unstabcores.ItemUnstabSunCore;
import me.poke.timecore.items.unstabcores.ItemUnstabThunderCore;
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
		SunCapsule = new ItemStabSunlightCore();
		RainCapsule = new ItemStabCloudCore();
		ThunderStormCapsule = new ItemStabThunderCore();
		DayCapsule = new ItemStabDaylightCore();
		NightCapsule = new ItemStabMoonlightCore();
		
		//Essences
		SunEss = new ItemSunlightFragment();
		RainEss = new ItemCloudFragment();
		ThunderEss = new ItemThunderFragment();
		DayEss = new ItemDaylightFragment();
		NightEss = new ItemMoonlightFragment();
		
		//Cores
		SunCore = new ItemUnstabSunCore();
		RainCore = new ItemUnstabCloudCore();
		ThunderCore = new ItemUnstabThunderCore();
		DayCore = new ItemUnstabDayCore();
		NightCore = new ItemUnstabMoonlightCore();
		
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
