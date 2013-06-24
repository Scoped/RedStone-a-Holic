package com.Scorpio.RsaH.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Scorpio.RsaH.block.ModBlocks;
import com.Scorpio.RsaH.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{
	
	public static void recipesInit()
	{
		/**
		 * Block Recipe Registry
		 * count: 1
		 */
		
		/*
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BlueStoneTorchActive, 1, 0), new Object[]
				{
					"B", "S",'B', Item.redstone , 'S', Item.stick
				});
		*/
		/*
		GameRegistry.addSmelting(Block.dirt.blockID, new ItemStack(ModBlocks.BlueStoneTorchActive, 1, 0), 1f);
		*/
		/*
		ItemStack enchant = new ItemStack(ModBlocks.BlueStoneTorchActive);
		{
			enchant.addEnchantment(Enchantment.fireAspect, 2);
		}
		*/
		/*
		GameRegistry.addRecipe(enchant, new Object[]
		{
			"DSD","DSD", "DSD",'D', Block.dirt, 'S', Block.stone
		});
		*/
		
		/**
		 * Block-Block Recipe Registry
		 * count: 0
		 */
		
		/**
		 * Block-Torch Recipe Registry
		 * count: 1
		 */
		//BlueStoneTorchActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BlueStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_BlueStone), new ItemStack(Item.stick)
				});
		
		//BlackStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BlackStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_BlackStone), new ItemStack(Item.stick)
				});
		
		//BrownStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrownStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_BrownStone), new ItemStack(Item.stick)
				});
		
		//CyanStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CyanStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_CyanStone), new ItemStack(Item.stick)
				});
		
		//GlowStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_GlowStone), new ItemStack(Item.stick)
				});
		
		//GrayStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GrayStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_GrayStone), new ItemStack(Item.stick)
				});
		
		//GreenStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GreenStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_GreenStone), new ItemStack(Item.stick)
				});
		
		//LightBlueStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.LightBlueStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_LightBlueStone), new ItemStack(Item.stick)
				});
		
		//LightGrayStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.LightGrayStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_LightGrayStone), new ItemStack(Item.stick)
				});
		
		//LimeGreenStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.LimeGreenStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_LimeGreenStone), new ItemStack(Item.stick)
				});
		
		//MagentaStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.MagentaStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_MagentaStone), new ItemStack(Item.stick)
				});
		
		//OrangeStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.OrangeStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_MagmaStone), new ItemStack(Item.stick)
				});
		
		//PinkStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.PinkStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_OrangeStone), new ItemStack(Item.stick)
				});
		
		//PurpleStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.PurpleStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_PinkStone), new ItemStack(Item.stick)
				});
		
		//WhiteStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WhiteStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_PurpleStone), new ItemStack(Item.stick)
				});
		
		//YellowStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.YellowStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_WhiteStone), new ItemStack(Item.stick)
				});
		
		//MagmaStoneBlockActive
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.MagmaStoneTorchActive, 1, 0), new Object[]
				{
					new ItemStack(ModItems.Dust_YellowStone), new ItemStack(Item.stick)
				});
		
		/*
		 **
		 * Item Recipe Registry
		 * Count: 18
		 */
		
		/**
		 * Item-Dust Recipe Registry
		 * Count: 18
		 */
		//Dust_BlueStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_BlueStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 4)
				});
		
		//Dust_BlackStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_BlackStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 0)
				});
		
		//Dust_BrownStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_BrownStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 3)
				});
		
		//Dust_CyanStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_CyanStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 6)
				});
		
		//Dust_GlowStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_GlowStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.lightStoneDust)
				});
		
		//Dust_GrayStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_GrayStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 8)
				});
		
		//Dust_GreenStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_GreenStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 2)
				});
		
		//Dust_LightBlueStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_LightBlueStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 12)
				});
		
		//Dust_LightGrayStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_LightGrayStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 7)
				});
		
		//Dust_LimeGreenStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_LimeGreenStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 10)
				});
		
		//Dust_MagentaStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_MagentaStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 13)
				});
		
		//Dust_MagmaStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_MagmaStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.magmaCream)
				});
		
		//Dust_OrangeStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_OrangeStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 14)
				});
		
		//Dust_PinkStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_PinkStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 9)
				});
		
		//Dust_PurpleStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_PurpleStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 5)
				});
		
		//Dust_WhiteStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_WhiteStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 15)
				});
		
		//Dust_YellowStone
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Dust_YellowStone, 1, 0), new Object[]
				{
					new ItemStack(Item.redstone), new ItemStack(Item.dyePowder, 1, 11)
				});
		
	}
}
