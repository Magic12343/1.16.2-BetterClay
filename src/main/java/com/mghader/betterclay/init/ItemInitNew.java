package com.mghader.betterclay.init;

import com.mghader.betterclay.BetterClay;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {
     
	public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, BetterClay.MOD_ID);
	
	public static final RegistryObject<Item> STONEWARE_BRICK = ITEMS.register("stoneware_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> ADOBE_BALL = ITEMS.register("adobe_ball", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static final RegistryObject<Item> ADOBE_BRICK = ITEMS.register("adobe_brick", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	//ITEMGROUP BLOCKS
	
	

}
