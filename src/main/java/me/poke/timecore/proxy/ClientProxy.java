package me.poke.timecore.proxy;

import me.poke.timecore.init.ModBlocks;
import me.poke.timecore.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
