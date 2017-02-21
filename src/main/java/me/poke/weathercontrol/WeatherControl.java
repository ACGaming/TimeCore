package me.poke.weathercontrol;

import me.poke.weathercontrol.init.ModBlocks;
import me.poke.weathercontrol.init.ModCrafting;
import me.poke.weathercontrol.init.ModItems;
import me.poke.weathercontrol.proxy.CommonProxy;
import me.poke.weathercontrol.world.ModWorldGeneration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class WeatherControl {

	@Instance
	public static WeatherControl instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final WeatherControlTab CREATIVE_TAB = new WeatherControlTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("Weather Control PreInititialization...");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		System.out.println("Weather Control Inititialization...");
		proxy.init();
		
		ModCrafting.register();

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("Weather Control Post Inititialization...");
	}
}
