package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;

import com.Scorpio.RsaH.lib.BlockIDs;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block BlueStoneBlock;
	public static Block BlackStoneBlock;
	public static Block BrownStoneBlock;
	public static Block CyanStoneBlock;
	public static Block GlowStoneBlock;
	public static Block GrayStoneBlock;
	public static Block GreenStoneBlock;
	public static Block LightBlueStoneBlock;
	public static Block LightGrayStoneBlock;
	public static Block LimeGreenStoneBlock;
	public static Block MagentaStoneBlock;
	public static Block OrangeStoneBlock;
	public static Block PinkStoneBlock;
	public static Block PurpleStoneBlock;
	public static Block WhiteStoneBlock;
	public static Block YellowStoneBlock;
	public static Block MagmaStoneBlock;
	public static Block StrangeStoneBlock;
	
	public static void BlocksInit()
	{
		BlueStoneBlock = new Block_BlueStone(BlockIDs.BLOCK_BLUESTONE_ID);
		BlackStoneBlock = new Block_BlackStone(BlockIDs.BLOCK_BLACKSTONE_ID);
		BrownStoneBlock = new Block_BrownStone(BlockIDs.BLOCK_BROWNSTONE_ID);
		CyanStoneBlock = new Block_CyanStone(BlockIDs.BLOCK_CYANSTONE_ID);
		GlowStoneBlock = new Block_GlowStone(BlockIDs.BLOCK_GLOWSTONE_ID);
		GrayStoneBlock = new Block_GrayStone(BlockIDs.BLOCK_GREYSTONE_ID);
		GreenStoneBlock = new Block_GreenStone(BlockIDs.BLOCK_GREENSTONE_ID);
		LightBlueStoneBlock = new Block_LightBlueStone(BlockIDs.BLOCK_LIGHTSTONE_ID);
		LightGrayStoneBlock = new Block_LightGrayStone(BlockIDs.BLOCK_LIGHTGRAYTONE_ID);
		LimeGreenStoneBlock = new Block_LimeGreenStone(BlockIDs.BLOCK_LIMEGREENSTONE_ID);
		MagentaStoneBlock = new Block_MagentaStone(BlockIDs.BLOCK_MAGENTASTONE_ID);
		OrangeStoneBlock = new Block_OrangeStone(BlockIDs.BLOCK_ORANGESTONE_ID);
		PinkStoneBlock = new Block_PinkStone(BlockIDs.BLOCK_PINKSTONE_ID);
		PurpleStoneBlock = new Block_PurpleStone(BlockIDs.BLOCK_PURPLESTONE);
		WhiteStoneBlock = new Block_WhiteStone(BlockIDs.BLOCK_WHITESTONE_ID);
		YellowStoneBlock = new Block_YellowStone(BlockIDs.BLOCK_YELLOWSTONE_ID);
		MagmaStoneBlock = new Block_MagmaStone(BlockIDs.BLOCK_MAGMASTONE_ID);
		StrangeStoneBlock = new Block_StrangeStone(BlockIDs.BLOCK_STRANGESTONE_ID);
		
		GameRegistry.registerBlock(BlueStoneBlock, Strings.BLOCK_BLUESTONE_NAME);
		GameRegistry.registerBlock(BlackStoneBlock, Strings.BLOCK_BLACKSTONE_NAME);
		GameRegistry.registerBlock(BrownStoneBlock, Strings.BLOCK_BROWNSTONE_NAME);
		GameRegistry.registerBlock(CyanStoneBlock, Strings.BLOCK_CYANSTONE_NAME);
		GameRegistry.registerBlock(GlowStoneBlock, Strings.BLOCK_GLOWSTONE_NAME);
		GameRegistry.registerBlock(GrayStoneBlock, Strings.BLOCK_GRAYSTONE_NAME);
		GameRegistry.registerBlock(GreenStoneBlock, Strings.BLOCK_GREENSTONE_NAME);
		GameRegistry.registerBlock(LightBlueStoneBlock, Strings.BLOCK_LIGHTBLUESTONE_NAME);
		GameRegistry.registerBlock(LightGrayStoneBlock, Strings.BLOCK_LIGHTGRAYSTONE_NAME);
		GameRegistry.registerBlock(LimeGreenStoneBlock, Strings.BLOCK_LIMEGREENSTONE_NAME);
		GameRegistry.registerBlock(MagentaStoneBlock, Strings.BLOCK_MAGENTASTONE_NAME);
		GameRegistry.registerBlock(OrangeStoneBlock, Strings.BLOCK_ORANGESTONE_NAME);
		GameRegistry.registerBlock(PinkStoneBlock, Strings.BLOCK_PINKSTONE_NAME);
		GameRegistry.registerBlock(PurpleStoneBlock, Strings.BLOCK_PURPLESTONE_NAME);
		GameRegistry.registerBlock(WhiteStoneBlock, Strings.BLOCK_WHITESTONE_NAME);
		GameRegistry.registerBlock(YellowStoneBlock, Strings.BLOCK_YELLOWSTONE_NAME);
		GameRegistry.registerBlock(MagmaStoneBlock, Strings.BLOCK_MAGMASTONE_NAME);
		GameRegistry.registerBlock(StrangeStoneBlock, Strings.BLOCK_STRANGESTONE_NAME);
	}
}
