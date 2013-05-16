package com.Scorpio.RsaH.item;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Strings;

public class Item_Dust_GlowStone extends ItemRSaH
{
	public Item_Dust_GlowStone(int id)
	{
		super(id);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.ITEM_DUST_GLOWSTONE_NAME);
	}
}
