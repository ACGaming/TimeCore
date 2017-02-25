package me.poke.timecore.world;

import java.util.Random;

import com.google.common.base.Predicate;

import me.poke.timecore.init.ModBlocks;
import net.minecraft.block.BlockNetherrack;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0){ //Overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if(world.provider.getDimension()== -1){
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if(world.provider.getDimension()==1){
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}

	public void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,	IChunkProvider chunkProvider) {
		generateOre(ModBlocks.SunOre.getDefaultState(), world, random, chunkX*16,  chunkZ*16, 1,126, 4, 10);
		
	}
	
	public void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
		generateOre(ModBlocks.MoonOre.getDefaultState(), world, random, chunkX*16, chunkZ*16, 1, 255, 6, 11);
	}

	public void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.CloudOre.getDefaultState(), world, random, chunkX*16, chunkZ*16, 30,255 , 6, 11);
		generateOre(ModBlocks.ThunderOre.getDefaultState(), world, random, chunkX*16, chunkZ*16, 1, 30, 4, 9);
		generateOre(ModBlocks.ClearOre.getDefaultState(), world, random, chunkX*16, chunkZ*16, 1, 16, 4, 6);
	}
	
	public void generateOre(IBlockState ore, World world, Random random, int x, int z,int minY, int maxY, int size, int chances) { //size between 4 and 7
		int deltaY = maxY - minY; 
		Predicate<IBlockState> predicate = new StonePredicate();
		if(world.provider.getDimension()==0)
			predicate = new StonePredicate();
		if(world.provider.getDimension()==-1)
			predicate = new NetherrackPredicate();
		if(world.provider.getDimension()==1)
			predicate = new EndStonePredicate();
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x+random.nextInt(16), minY+random.nextInt(deltaY), z+random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size, predicate);
			generator.generate(world, random, pos);
	
		}
	}
	
	 /**
     * derived from {@link net.minecraft.world.gen.feature.WorldGenMinable}
     */
    static class NetherrackPredicate implements Predicate<IBlockState> {
        public NetherrackPredicate() {
        }
 
        public boolean apply(IBlockState state) {
            if ( state != null && state.getBlock() == Blocks.NETHERRACK ) {
                return true;
            }
            else {
                return false;
            }
        }
    }
        
        /**
         * derived from {@link net.minecraft.world.gen.feature.WorldGenMinable}
         */
        static class EndStonePredicate implements Predicate<IBlockState> {
            public EndStonePredicate() {
            }
     
            public boolean apply(IBlockState state) {
                if ( state != null && state.getBlock() == Blocks.END_STONE ) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }	

	/**
	 * derived from {@link net.minecraft.world.gen.feature.WorldGenMinable}
	 */
	static class StonePredicate implements Predicate<IBlockState> {
	    public StonePredicate() {
	    }
	
	    public boolean apply(IBlockState state) {
	        if ( state != null && state.getBlock() == Blocks.STONE ) {
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	}
}


