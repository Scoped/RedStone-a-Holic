package com.Scorpio.RsaH.block;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Block_OrangeStone extends Block
{
	public Block_OrangeStone(int id)
	{
		super(id, Material.rock);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.BLOCK_ORANGESTONE_NAME);
	}
}