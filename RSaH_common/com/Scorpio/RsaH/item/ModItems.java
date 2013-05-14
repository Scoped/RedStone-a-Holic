package com.Scorpio.RsaH.item;

import com.Scorpio.RsaH.lib.ItemIDs;

import net.minecraft.item.Item;

public class ModItems
{
	public static Item Dust_BlueStone;
	
	public static void ItemInit()
	{
		Dust_BlueStone = new Item_Dust_BlueStone(ItemIDs.DUST_BLUESTONE_ID);
	};
}
