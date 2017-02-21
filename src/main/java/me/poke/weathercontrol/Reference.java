package me.poke.weathercontrol;

public class Reference {

	
	public static final String MOD_ID = "weathercontrol";
	public static final String NAME = "Weather Control Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION="[1.10.2]";
	public static final String CLIENT_PROXY_CLASS = "me.poke.weathercontrol.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.poke.weathercontrol.proxy.ServertProxy";
	
	public static enum WeatherControlItems{
		
		//Capsules
		EMPTYCAPSULE("EmptyCapsule", "ItemEmptyCapsule"),
		SUNCAPSULE("SunCapsule", "ItemSunCapsule"),
		RAINCAPSULE("RainCapsule", "ItemRainCapsule"),
		THUNDERCAPSULE("ThunderStormCapsule", "ItemThunderStormCapsule"),
		DAYCAPSULE("DayCapsule", "ItemDayCapsule"),
		NIGHTCAPSULE("NightCapsule", "ItemNightCapsule"),
		//Essences
		DAYESS("DaylightEssence", "ItemDayEss"),
		NIGHTESS("MoonlightEssence", "ItemNightEss"),
		RAINESS("CloudEssence", "ItemRainEss"),
		SUNESS("SunlightEssence", "ItemSunEss"),
		THUNDERESS("ThunderEssence", "ItemThunderEss"),
		//Cores
		DAYCORE("DaylightCore", "ItemDayCore"),
		NIGHTCORE("MoonlightCore", "ItemNightCore"),
		RAINCORE("CloudCore", "ItemRainCore"),
		SUNCORE("SunlightCore", "ItemSunCore"),
		THUNDERCORE("ThunderCore", "ItemThunderCore"),
		//Misc
		NETHER_SHARD("NetherStarShard", "ItemNetherStarShard");
		
		private String unlocalizedName;
		private String registryName;
		
		WeatherControlItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
	
	public static enum WeatherControlBlocks
	{
		SUN_ORE("SunOre", "BlockSunOre"),
		CLOUD_ORE("CloudOre", "BlockCloudOre"),
		MOON_ORE("MoonOre", "BlockMoonOre"),
		CLEAR_ORE("ClearOre", "BlockClearOre"),
		THUNDER_ORE("ThunderOre", "BlockThunderOre");
		
		private String unlocalizedName;
		private String registryName;
		
		WeatherControlBlocks(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() 
		{
			return registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
	}
}
