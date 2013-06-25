package com.Scorpio.RsaH.item;

import net.minecraft.item.Item;

import com.Scorpio.RsaH.lib.ItemIDs;
import com.Scorpio.RsaH.tileEntity.TileEntityWire;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	
	public static Item Dust_BlueStone;
	
	public static void ItemInit()
	{
		
		Dust_BlueStone = new Item_Dust_BlueStone(ItemIDs.ITEM_DUST_BLUESTONE_ID);
		
		GameRegistry.registerTileEntity(TileEntityWire.class, "Wire");
		
	};
}
