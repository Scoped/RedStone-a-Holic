package com.Scorpio.RsaH.creativeTab;

import com.Scorpio.RsaH.block.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRSaH extends CreativeTabs
{
	public TabRSaH(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ModBlocks.BlueStoneBlock, 1, 0);
	}
}
