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
import me.poke.timecore.items.wands.ItemCloudWand;
import me.poke.timecore.items.wands.ItemDaylightWand;
import me.poke.timecore.items.wands.ItemEmptyWand;
import me.poke.timecore.items.wands.ItemMoonlightWand;
import me.poke.timecore.items.wands.ItemSunlightWand;
import me.poke.timecore.items.wands.ItemThunderWand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Capsules
	public static Item EmptyCapsule, StabSunlightCore, StabCloudCore, StabThunderCore, StabDaylightCore, StabMoonlightCore;

	//Fragments
	public static Item SunlightFragment, CloudFragment, ThunderFragment, DaylightFragment, MoonlightFragment;
	
	//Cores
	public static Item SunCore, RainCore, ThunderCore, DayCore, NightCore;
	
	//Misc
	public static Item NetherStarShard;
	
	//Wands
	public static Item EmptyWand, SunlightWand, CloudWand, ThunderWand, DaylightWand, MoonlightWand;
	
	public static void init(){
		//Capsules
		EmptyCapsule = new ItemEmptyCap();
		StabSunlightCore = new ItemStabSunlightCore();
		StabCloudCore = new ItemStabCloudCore();
		StabThunderCore = new ItemStabThunderCore();
		StabDaylightCore = new ItemStabDaylightCore();
		StabMoonlightCore = new ItemStabMoonlightCore();
		
		//Essences
		SunlightFragment = new ItemSunlightFragment();
		CloudFragment = new ItemCloudFragment();
		ThunderFragment = new ItemThunderFragment();
		DaylightFragment = new ItemDaylightFragment();
		MoonlightFragment = new ItemMoonlightFragment();
		
		//Cores
		SunCore = new ItemUnstabSunCore();
		RainCore = new ItemUnstabCloudCore();
		ThunderCore = new ItemUnstabThunderCore();
		DayCore = new ItemUnstabDayCore();
		NightCore = new ItemUnstabMoonlightCore();
		
		//Misc
		NetherStarShard = new ItemNetherStarShard();
		
		//Wands
		EmptyWand = new ItemEmptyWand();
		SunlightWand = new ItemSunlightWand();
		CloudWand = new ItemCloudWand();
		ThunderWand = new ItemThunderWand();
		DaylightWand = new ItemDaylightWand();
		MoonlightWand = new ItemMoonlightWand();
	}
	
	public static void register(){
		//Capsule
		GameRegistry.register(EmptyCapsule);
		GameRegistry.register(StabSunlightCore);
		GameRegistry.register(StabCloudCore);
		GameRegistry.register(StabThunderCore);
		GameRegistry.register(StabDaylightCore);
		GameRegistry.register(StabMoonlightCore);
		
		//Fragments
		GameRegistry.register(SunlightFragment);
		GameRegistry.register(CloudFragment);
		GameRegistry.register(ThunderFragment);
		GameRegistry.register(DaylightFragment);
		GameRegistry.register(MoonlightFragment);
		
		//Cores
		GameRegistry.register(SunCore);
		GameRegistry.register(RainCore);
		GameRegistry.register(ThunderCore);
		GameRegistry.register(DayCore);
		GameRegistry.register(NightCore);
		
		//Misc
		GameRegistry.register(NetherStarShard);
		
		//Wands
		GameRegistry.register(EmptyWand);
		GameRegistry.register(SunlightWand);
		GameRegistry.register(CloudWand);
		GameRegistry.register(ThunderWand);
		GameRegistry.register(DaylightWand);
		GameRegistry.register(MoonlightWand);
	}
	
	public static void registerRenders(){
		//Capsule
		registerRender(EmptyCapsule);
		registerRender(StabSunlightCore);
		registerRender(StabCloudCore);
		registerRender(StabThunderCore);
		registerRender(StabDaylightCore);
		registerRender(StabMoonlightCore);
		
		//Fragments
		registerRender(SunlightFragment);
		registerRender(CloudFragment);
		registerRender(ThunderFragment);
		registerRender(DaylightFragment);
		registerRender(MoonlightFragment);
		
		//Cores
		registerRender(SunCore);
		registerRender(RainCore);
		registerRender(ThunderCore);
		registerRender(DayCore);
		registerRender(NightCore);
		
		//Misc
		registerRender(NetherStarShard);
		
		//Wands
		registerRender(EmptyWand);
		registerRender(SunlightWand);
		registerRender(CloudWand);
		registerRender(ThunderWand);
		registerRender(DaylightWand);
		registerRender(MoonlightWand);
		
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
