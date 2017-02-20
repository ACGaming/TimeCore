package me.poke.weathercontrol.proxy;

import me.poke.weathercontrol.init.ModBlocks;
import me.poke.weathercontrol.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
