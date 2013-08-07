package com.Scorpio.RsaH.item;

import net.minecraft.item.Item;

import com.Scorpio.RsaH.lib.ItemIDs;

public class ModItems
{
	
	public static Item Dust_BlueStone;
	
	public static void ItemInit()
	{
		
		Dust_BlueStone = new Item_Dust_BlueStone(ItemIDs.ITEM_DUST_BLUESTONE_ID);
		
	};
}
