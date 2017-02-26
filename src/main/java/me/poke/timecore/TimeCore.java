package me.poke.timecore;

import me.poke.timecore.init.ModBlocks;
import me.poke.timecore.init.ModCrafting;
import me.poke.timecore.init.ModItems;
import me.poke.timecore.proxy.CommonProxy;
import me.poke.timecore.world.ModWorldGeneration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class TimeCore {

	@Instance
	public static TimeCore instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final TimeCoreTab CREATIVE_TAB = new TimeCoreTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("TimeCore PreInititialization...");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		System.out.println("TimeCore Inititialization...");
		proxy.init();
		ModCrafting.register();

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("TimeCore Post Inititialization...");
	}
}
