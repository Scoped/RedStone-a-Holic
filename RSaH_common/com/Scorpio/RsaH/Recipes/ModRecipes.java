package com.Scorpio.RsaH.recipes;

import com.Scorpio.RsaH.block.ModBlocks;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModRecipes
{
	
	public static void recipesInit()
	{
		for(int i = 0;i < 16;i++)
		{
			GameRegistry.addRecipe(new ItemStack(ModBlocks.MetaMineralBlocks, 1, i), "XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ModBlocks.MetaMineralBlocks, 1, i));
		}
	}
}
