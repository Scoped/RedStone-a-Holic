package com.Scorpio.RsaH.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Item_Block_MetaTorchesIdle extends ItemBlock
{
	public Item_Block_MetaTorchesIdle(int id)
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
		case 0: {name = "BlueStoneIdle"; break;}
		case 1: {name = "BlackStoneIdle"; break;}
		case 2: {name = "BrownStoneIdle"; break;}
		case 3: {name = "CyanStoneIdle"; break;}
		case 4: {name = "YellowStoneIdle"; break;}
		case 5: {name = "GrayStoneIdle"; break;}
		case 6: {name = "GreenStoneIdle"; break;}
		case 7: {name = "LightBlueStoneIdle"; break;}
		case 8: {name = "LightGrayStoneIdle"; break;}
		case 9: {name = "LimeGreenStoneIdle"; break;}
		case 10: {name = "MagentaStoneIdle"; break;}
		case 11: {name = "WhiteStoneIdle"; break;}
		case 12: {name = "OrangeStoneIdle"; break;}
		case 13: {name = "PinkStoneIdle"; break;}
		case 14: {name = "PurpleStoneIdle"; break;}
		case 15: {name = "MagmaStoneIdle"; break;}
		case 16: {name = "GlowStoneIdle"; break;}
		}
		return this.getUnlocalizedName() + name;
	}
}
