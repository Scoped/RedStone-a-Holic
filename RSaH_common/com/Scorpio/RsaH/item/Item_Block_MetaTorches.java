package com.Scorpio.RsaH.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Item_Block_MetaTorches extends ItemBlock
{
	
	public Item_Block_MetaTorches(int id)
	{
		super(id);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
	public int getMetadata(int meta)
	{
		return meta;
	}
	
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name = "";
		
		switch(itemStack.getItemDamage())
		{
		case 0: {name = "BlueStone"; break;}
		case 1: {name = "BlackStone"; break;}
		case 2: {name = "BrownStone"; break;}
		case 3: {name = "CyanStone"; break;}
		case 4: {name = "YellowStone"; break;}
		case 5: {name = "GrayStone"; break;}
		case 6: {name = "GreenStone"; break;}
		case 7: {name = "LightBlueStone"; break;}
		case 8: {name = "LightGrayStone"; break;}
		case 9: {name = "LimeGreenStone"; break;}
		case 10: {name = "MagentaStone"; break;}
		case 11: {name = "OrangeStone"; break;}
		case 12: {name = "PinkStone"; break;}
		case 13: {name = "PurpleStone"; break;}
		case 14: {name = "WhiteStone"; break;}
		case 15: {name = "MagmaStone"; break;}
		case 16: {name = "GlowStone"; break;}
		}
		return this.getUnlocalizedName() + name;
	}
}
