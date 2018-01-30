package com.Mrbysco.EnhancedFarming.init;

import java.util.ArrayList;

import com.Mrbysco.EnhancedFarming.block.BlockCustomCrop;
import com.Mrbysco.EnhancedFarming.block.BlockFruitLeaves;
import com.Mrbysco.EnhancedFarming.block.BlockGrowableSapling;
import com.Mrbysco.EnhancedFarming.block.BlockNetherFlower;
import com.Mrbysco.EnhancedFarming.block.BlockNonFruitLeaves;
import com.Mrbysco.EnhancedFarming.block.BlockScarecrow;
import com.Mrbysco.EnhancedFarming.block.EnumCropType;
import com.Mrbysco.EnhancedFarming.block.EnumSaplingType;
import com.Mrbysco.EnhancedFarming.block.crops.BlockTomatoCrop;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class FarmingBlocks {
	public static BlockCrops mint_crop;
	public static BlockBush nether_flower_crop;
	
	public static BlockLeaves apple_leaves;
	public static BlockLeaves blooming_apple_leaves;
	public static BlockLeaves lemon_leaves;
	public static BlockLeaves blooming_lemon_leaves;
	public static BlockLeaves orange_leaves;
	public static BlockLeaves blooming_orange_leaves;
	
	public static BlockGrowableSapling apple_sapling;
	public static BlockGrowableSapling lemon_sapling;
	public static BlockGrowableSapling orange_sapling;
	
	public static Block scarecrow;
	
	//New Content
	public static BlockCrops tomato_crop;
	public static BlockCrops cucumber_crop;
	public static BlockCrops aubergine_crop;

	public static BlockLeaves cherry_leaves;
	public static BlockLeaves blooming_cherry_leaves;
	public static BlockLeaves pear_leaves;
	public static BlockLeaves blooming_pear_leaves;
	public static BlockLeaves banana_leaves;
	public static BlockLeaves blooming_banana_leaves;
	public static BlockLeaves avocado_leaves;
	public static BlockLeaves blooming_avocado_leaves;
	
	public static BlockGrowableSapling cherry_sapling;
	public static BlockGrowableSapling pear_sapling;
	public static BlockGrowableSapling banana_sapling;
	public static BlockGrowableSapling avocado_sapling;
	
    public static ArrayList<Block> BLOCKS = new ArrayList<>();
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        
        mint_crop = registerBlock(new BlockCustomCrop("mintcrop", "mint_crop", EnumCropType.MINT));
		nether_flower_crop = registerBlock(new BlockNetherFlower("netherflowercrop", "nether_flower_crop"));
		
		apple_leaves = registerBlock(new BlockFruitLeaves("appleleaves", "apple_leaves", EnumSaplingType.APPLE));
		blooming_apple_leaves = registerBlock(new BlockNonFruitLeaves("bloomingappleleaves", "blooming_apple_leaves", EnumSaplingType.APPLE));
		
		lemon_leaves = registerBlock(new BlockFruitLeaves("lemonleaves", "lemon_leaves", EnumSaplingType.LEMON));
		blooming_lemon_leaves = registerBlock(new BlockNonFruitLeaves("bloominglemonleaves", "blooming_lemon_leaves", EnumSaplingType.LEMON));
		
		orange_leaves = registerBlock(new BlockFruitLeaves("orangeleaves", "orange_leaves", EnumSaplingType.ORANGE));
		blooming_orange_leaves = registerBlock(new BlockNonFruitLeaves("bloomingorangeleaves", "blooming_orange_leaves", EnumSaplingType.ORANGE));
		
		//New Content
		tomato_crop = registerBlock(new BlockTomatoCrop("tomatocrop", "tomato_crop"));
		cucumber_crop = registerBlock(new BlockCustomCrop("cucumbercrop", "cucumber_crop", EnumCropType.CUCUMBER));
		aubergine_crop = registerBlock(new BlockCustomCrop("auberginecrop", "aubergine_crop",  EnumCropType.AUBERGINE));

		cherry_leaves = registerBlock(new BlockFruitLeaves("cherryleaves", "cherry_leaves", EnumSaplingType.CHERRY));
		blooming_cherry_leaves = registerBlock(new BlockNonFruitLeaves("bloomingcherryleaves", "blooming_cherry_leaves", EnumSaplingType.CHERRY));
		
		pear_leaves = registerBlock(new BlockFruitLeaves("pearleaves", "pear_leaves", EnumSaplingType.PEAR));
		blooming_pear_leaves = registerBlock(new BlockNonFruitLeaves("bloomingpearleaves", "blooming_pear_leaves", EnumSaplingType.PEAR));
		
		banana_leaves = registerBlock(new BlockFruitLeaves("bananaleaves", "banana_leaves", EnumSaplingType.BANANA));
		blooming_banana_leaves = registerBlock(new BlockNonFruitLeaves("bloomingbananaleaves", "blooming_banana_leaves", EnumSaplingType.BANANA));
		
		avocado_leaves = registerBlock(new BlockFruitLeaves("avocadoleaves", "avocado_leaves", EnumSaplingType.AVOCADO));
		blooming_avocado_leaves = registerBlock(new BlockNonFruitLeaves("bloomingavocadoleaves", "blooming_avocado_leaves", EnumSaplingType.AVOCADO));
		
		apple_sapling = registerBlock(new BlockGrowableSapling("applesapling", "apple_sapling", EnumSaplingType.APPLE));
		lemon_sapling = registerBlock(new BlockGrowableSapling("lemonsapling", "lemon_sapling", EnumSaplingType.LEMON));
		orange_sapling = registerBlock(new BlockGrowableSapling("orangesapling", "orange_sapling", EnumSaplingType.ORANGE));

		cherry_sapling = registerBlock(new BlockGrowableSapling("cherrysapling", "cherry_sapling", EnumSaplingType.CHERRY));
		pear_sapling = registerBlock(new BlockGrowableSapling("pearsapling", "pear_sapling", EnumSaplingType.PEAR));
		banana_sapling = registerBlock(new BlockGrowableSapling("bananasapling", "banana_sapling", EnumSaplingType.BANANA));
		avocado_sapling = registerBlock(new BlockGrowableSapling("avocadosapling", "avocado_sapling", EnumSaplingType.AVOCADO));
		//End new content
		
		scarecrow = registerBlock(new BlockScarecrow("scarecrow", "scarecrow"));
		
		registry.registerAll(BLOCKS.toArray(new Block[0]));
    }
    
    public static <T extends Block> T registerBlock(T block)
    {
        return registerBlock(block, new ItemBlock(block));
    }
    
    public static <T extends Block> T registerBlock(T block, ItemBlock item)
    {
    	item.setRegistryName(block.getRegistryName());
    	FarmingItems.ITEMS.add(item);
        BLOCKS.add(block);
        return block;
    }
}
