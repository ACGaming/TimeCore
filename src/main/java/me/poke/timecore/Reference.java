package me.poke.timecore;

public class Reference {

	
	public static final String MOD_ID = "timecore";
	public static final String NAME = "TimeCore";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION="[1.10.2]";
	public static final String CLIENT_PROXY_CLASS = "me.poke.timecore.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "me.poke.timecore.proxy.ServerProxy";
	
	public static enum WeatherControlItems{
		
		//Stabilized Cores
		EMPTY_CAPSULE("EmptyCapsule", "empty_capsule"),
		STAB_SUNLIGHT_CORE("StabSunlightCore", "stab_sunlight_core"),
		STAB_CLOUD_CORE("StabCloudCore", "stab_cloud_core"),
		STAB_THUNDER_CORE("StabThunderCore", "stab_thunder_core"),
		STAB_DAYLIGHT_CORE("StabDaylightCore", "stab_daylight_core"),
		STAB_MOONLIGHT_CORE("StabMoonlightCore", "stab_moonlight_core"),
		
		//Unstable Cores
		UNSTAB_DAYLIGHT_CORE("UnstabDaylightCore", "unstab_daylight_core"),
		UNSTAB_MOONLIGHT_CORE("UnstabMoonlightCore", "unstab_moonlight_core"),
		UNSTAB_CLOUD_CORE("UnstabCloudCore", "unstab_cloud_core"),
		UNSTAB_SUNLIGHT_CORE("UnstabSunlightCore", "unstab_sunlight_core"),
		UNSTAB_THUNDER_CORE("UnstabThunderCore", "unstab_thunder_core"),
		
		//Fragments
		DAYLIGHT_FRAGMENT("DaylightFragment", "daylight_fragment"),
		MOONLIGHT_FRAGMENT("MoonlightFragment", "moonlight_fragment"),
		CLOUD_FRAGMENT("CloudFragment", "cloud_fragment"),
		SUNLIGHT_FRAGMENT("SunlightFragment", "sunlight_fragment"),
		THUNDER_FRAGMENT("ThunderFragment", "thunder_fragment"),
		
		//Misc
		NETHER_SHARD("NetherStarShard", "netherstar_shard"),
		
		//Wands
		EMPTY_WAND("EmptyWand", "empty_wand"),
		SUNLIGHT_WAND("SunlightWand", "sunlight_wand"),
		CLOUD_WAND("CloudWand", "cloud_wand"),
		THUNDER_WAND("ThunderWand", "thunder_wand"),
		DAYLIGHT_WAND("DaylightWand", "daylight_wand"),
		MOONLIGHT_WAND("MoonlightWand", "moonlight_wand");
		
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
		DAYLIGHT_ORE("DaylightOre", "daylight_ore"),
		CLOUD_ORE("CloudOre", "cloud_ore"),
		MOONLIGHT_ORE("MoonlightOre", "moonlight_ore"),
		SUNLIGHT_ORE("SunlightOre", "sunlight_ore"),
		THUNDER_ORE("ThunderOre", "thunder_ore");
		
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
