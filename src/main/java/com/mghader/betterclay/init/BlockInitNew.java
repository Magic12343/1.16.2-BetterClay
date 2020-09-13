package com.mghader.betterclay.init;

import com.mghader.betterclay.BetterClay;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInitNew {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterClay.MOD_ID);
	
	//Variant Bricks
	public static final RegistryObject<Block> BIG_BRICK = BLOCKS.register("big_brick", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Cracked Bricks 
	public static final RegistryObject<Block> BROKEN_BRICKS = BLOCKS.register("broken_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BROKEN_BRICKS_SLAB = BLOCKS.register("broken_bricks_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BROKEN_BRICKS_STAIRS = BLOCKS.register("broken_bricks_stairs",
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BROKEN_BRICKS_WALL = BLOCKS.register("broken_bricks_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Dirty Bricks
	public static final RegistryObject<Block> DIRTY_BRICKS = BLOCKS.register("dirty_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> DIRTY_BRICKS_SLAB = BLOCKS.register("dirty_bricks_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> DIRTY_BRICKS_STAIRS = BLOCKS.register("dirty_bricks_stairs",
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> DIRTY_BRICKS_WALL = BLOCKS.register("dirty_bricks_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Bigger Bricks
	public static final RegistryObject<Block> BIGGER_BRICKS = BLOCKS.register("bigger_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BIGGER_BRICKS_SLAB = BLOCKS.register("bigger_bricks_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BIGGER_BRICKS_STAIRS = BLOCKS.register("bigger_bricks_stairs",
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> BIGGER_BRICKS_WALL = BLOCKS.register("bigger_bricks_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Cracked Bigger Bricks
	public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS = BLOCKS.register("cracked_bigger_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_SLAB = BLOCKS.register("cracked_bigger_bricks_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_STAIRS = BLOCKS.register("cracked_bigger_bricks_stairs",
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> CRACKED_BIGGER_BRICKS_WALL = BLOCKS.register("cracked_bigger_bricks_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Dirty Bigger Bricks
	public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS = BLOCKS.register("dirty_bigger_bricks", 
			() -> new Block(Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_SLAB = BLOCKS.register("dirty_bigger_bricks_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_STAIRS = BLOCKS.register("dirty_bigger_bricks_stairs",
			() -> new StairsBlock(Blocks.BRICKS::getDefaultState, Block.Properties.from(Blocks.BRICKS).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	public static final RegistryObject<Block> DIRTY_BIGGER_BRICKS_WALL = BLOCKS.register("dirty_bigger_bricks_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
	
	//Stoneware Source Block
	public static final RegistryObject<Block> STONEWARE_BLOCK = BLOCKS.register("stoneware_block", 
			() -> new Block(Block.Properties.from(Blocks.COAL_ORE).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0f, 3.0f)));
	
	//Stoneware Bricks
	
	
	//Stoneware Variant Bricks
	
	
	//Stoneware Cracked Bricks
	
	
	//Stoneware Dirty Bricks
	
	
	//Stoneware Bigger Bricks
	
	
	//Stoneware Cracked Bigger Bricks
	
	
	//Stoneware Dirty Bigger Bricks
	
	
}