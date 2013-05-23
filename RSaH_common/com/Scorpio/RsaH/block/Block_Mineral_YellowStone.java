package com.Scorpio.RsaH.block;

import net.minecraft.block.material.Material;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Strings;

public class Block_Mineral_YellowStone extends BlockRSaH
{
	public Block_Mineral_YellowStone(int id)
	{
		super(id, Material.rock);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.BLOCK_YELLOWSTONE_NAME);
	}
}
