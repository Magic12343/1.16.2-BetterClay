package com.mghader.betterclay.init;

import com.mghader.betterclay.BetterClay;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {
     
	public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, BetterClay.MOD_ID);
	
	public static final RegistryObject<Item> DEF_ITEM = ITEMS.register("debug_item", () -> new Item(new Item.Properties()));
	
}
