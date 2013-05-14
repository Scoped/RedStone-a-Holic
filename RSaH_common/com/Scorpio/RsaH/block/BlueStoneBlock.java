package com.Scorpio.RsaH.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlueStoneBlock extends BlockRSaH
{
	public BlueStoneBlock(int id)
	{
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("BlueStone");
	}
}
