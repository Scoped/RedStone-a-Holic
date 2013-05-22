package com.Scorpio.RsaH.item;

import net.minecraft.item.Item;

import com.Scorpio.RsaH.lib.ItemIDs;

public class ModItems
{
	/**
	 * Item Declaration
	 * Count: 18
	 */
	
	/**
	 * Item-Dust Declaration
	 * Count: 18
	 */
	public static Item Dust_BlueStone;
	public static Item Dust_BlackStone;
	public static Item Dust_BrownStone;
	public static Item Dust_CyanStone;
	public static Item Dust_GlowStone;
	public static Item Dust_GrayStone;
	public static Item Dust_GreenStone;
	public static Item Dust_LightBlueStone;
	public static Item Dust_LightGrayStone;
	public static Item Dust_LimeGreenStone;
	public static Item Dust_MagentaStone;
	public static Item Dust_MagmaStone;
	public static Item Dust_OrangeStone;
	public static Item Dust_PinkStone;
	public static Item Dust_PurpleStone;
	public static Item Dust_WhiteStone;
	public static Item Dust_YellowStone;
	
	public static void ItemInit()
	{
		/**
		 * Item
		 * Count: 18
		 */
		
		/**
		 * Item-Dust
		 * Count: 18
		 */
		Dust_BlueStone = new Item_Dust_BlueStone(ItemIDs.ITEM_DUST_BLUESTONE_ID);
		Dust_BlackStone = new Item_Dust_BlackStone(ItemIDs.ITEM_DUST_BLACKSTONE_ID);
		Dust_BrownStone = new Item_Dust_BrownStone(ItemIDs.ITEM_DUST_BROWNSTONE_ID);
		Dust_CyanStone = new Item_Dust_CyanStone(ItemIDs.ITEM_DUST_CYANSTONE_ID);
		Dust_GlowStone = new Item_Dust_GlowStone(ItemIDs.ITEM_DUST_GLOWSTONE_ID);
		Dust_GrayStone = new Item_Dust_GrayStone(ItemIDs.ITEM_DUST_GRAYSTONE_ID);
		Dust_GreenStone = new Item_Dust_GreenStone(ItemIDs.ITEM_DUST_GREENSTONE_ID);
		Dust_LightBlueStone = new Item_Dust_LightBlueStone(ItemIDs.ITEM_DUST_LIGHTBLUESTONE_ID);
		Dust_LightGrayStone = new Item_Dust_LightGrayStone(ItemIDs.ITEM_DUST_LIGHTGRAYSTONE_ID);
		Dust_LimeGreenStone = new Item_Dust_LimeGreenStone(ItemIDs.ITEM_DUST_LIMEGREENSTONE_ID);
		Dust_MagentaStone = new Item_Dust_MagentaStone(ItemIDs.ITEM_DUST_MAGENTASTONE_ID);
		Dust_MagmaStone = new Item_Dust_MagmaStone(ItemIDs.ITEM_DUST_MAGMASTONE_ID);
		Dust_OrangeStone = new Item_Dust_OrangeStone(ItemIDs.ITEM_DUST_ORANGESTONE_ID);
		Dust_PinkStone = new Item_Dust_PinkStone(ItemIDs.ITEM_DUST_PINKSTONE_ID);
		Dust_PurpleStone = new Item_Dust_PurpleStone(ItemIDs.ITEM_DUST_PURPLESTONE_ID);
		Dust_WhiteStone = new Item_Dust_WhiteStone(ItemIDs.ITEM_DUST_WHITESTONE_ID);
		Dust_YellowStone = new Item_Dust_YellowStone(ItemIDs.ITEM_DUST_YELLOWSTONE_ID);
	};
}
