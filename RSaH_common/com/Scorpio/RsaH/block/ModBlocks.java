package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.item.Item_Block_MetaMinerals;
import com.Scorpio.RsaH.lib.BlockIDs;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	
	public static Block MetaMineralBlocks;
	public static Block ParticleBlock;
	public static int modelWireID;

	public static Block BlueStoneWireBlock;
	public static Block BlackStoneWireBlock;
	public static Block BrownStoneWireBlock;
	public static Block CyanStoneWireBlock;
	public static Block GlowStoneWireBlock;
	public static Block GrayStoneWireBlock;
	public static Block GreenStoneWireBlock;
	public static Block LightBlueStoneWireBlock;
	public static Block LightGrayStoneWireBlock;
	public static Block LimeGreenStoneWireBlock;
	public static Block MagentaStoneWireBlock;
	public static Block OrangeStoneWireBlock;
	public static Block PinkStoneWireBlock;
	public static Block PurpleStoneWireBlock;
	public static Block WhiteStoneWireBlock;
	public static Block YellowStoneWireBlock;
	public static Block MagmaStoneWireBlock;

    public static Block BlueStoneTorchIdle;
    public static Block BlueStoneTorchActive;
    public static Block BlackStoneTorchIdle;
    public static Block BlackStoneTorchActive;
    public static Block BrownStoneTorchIdle;
    public static Block BrownStoneTorchActive;
    public static Block CyanStoneTorchIdle;
    public static Block CyanStoneTorchActive;
    public static Block GlowStoneTorchIdle;
    public static Block GlowStoneTorchActive;
    public static Block GrayStoneTorchIdle;
    public static Block GrayStoneTorchActive;
    public static Block GreenStoneTorchIdle;
    public static Block GreenStoneTorchActive;
    public static Block LightBlueStoneTorchIdle;
    public static Block LightBlueStoneTorchActive;
    public static Block LightGrayStoneTorchIdle;
    public static Block LightGrayStoneTorchActive;
    public static Block LimeGreenStoneTorchIdle;
    public static Block LimeGreenStoneTorchActive;
    public static Block MagentaStoneTorchIdle;
    public static Block MagentaStoneTorchActive;
    public static Block OrangeStoneTorchIdle;
    public static Block OrangeStoneTorchActive;
    public static Block PinkStoneTorchIdle;
	public static Block PinkStoneTorchActive;
	public static Block PurpleStoneTorchIdle;
	public static Block PurpleStoneTorchActive;
	public static Block WhiteStoneTorchIdle;
	public static Block WhiteStoneTorchActive;
	public static Block YellowStoneTorchIdle;
	public static Block YellowStoneTorchActive;
	public static Block MagmaStoneTorchIdle;
	public static Block MagmaStoneTorchActive;
	
	public static void BlocksInit()
	{
		MetaMineralBlocks = new Block_Meta_Minerals(BlockIDs.BLOCK_MINERAL_METABLOCKS_ID);
		ParticleBlock = new Block_ParticleBlock(BlockIDs.BLOCK_PARTICLEBLOCK_ID);
		
		BlueStoneWireBlock = new Block_Wire_BlueStone(BlockIDs.BLOCK_WIRE_BLUESTONE_ID);
		/*
		BlackStoneWireBlock = new Block_Wire_BlackStone(BlockIDs.BLOCK_WIRE_BLACKSTONE_ID);
		BrownStoneWireBlock = new Block_Wire_BrownStone(BlockIDs.BLOCK_WIRE_BROWNSTONE_ID);
		CyanStoneWireBlock = new Block_Wire_CyanStone(BlockIDs.BLOCK_WIRE_CYANSTONE_ID);
		GlowStoneWireBlock = new Block_Wire_GlowStone(BlockIDs.BLOCK_WIRE_GLOWSTONE_ID);
		GrayStoneWireBlock = new Block_Wire_GrayStone(BlockIDs.BLOCK_WIRE_GRAYSTONE_ID);
		GreenStoneWireBlock = new Block_Wire_GreenStone(BlockIDs.BLOCK_WIRE_GREENSTONE_ID);
		LightBlueStoneWireBlock = new Block_Wire_LightBlueStone(BlockIDs.BLOCK_WIRE_LIGHTBLUESTONE_ID);
		LightGrayStoneWireBlock = new Block_Wire_LightGrayStone(BlockIDs.BLOCK_WIRE_LIGHTGRAYSTONE_ID);
		LimeGreenStoneWireBlock = new Block_Wire_LimeGreenStone(BlockIDs.BLOCK_WIRE_LIMEGREENSTONE_ID);
		MagentaStoneWireBlock = new Block_Wire_MagentaStone(BlockIDs.BLOCK_WIRE_MAGENTASTONE_ID);
		OrangeStoneWireBlock = new Block_Wire_OrangeStone(BlockIDs.BLOCK_WIRE_ORANGESTONE_ID);
		PinkStoneWireBlock = new Block_Wire_PinkStone(BlockIDs.BLOCK_WIRE_PINKSTONE_ID);
		PurpleStoneWireBlock = new Block_Wire_PurpleStone(BlockIDs.BLOCK_WIRE_PURPLESTONE_ID);
		WhiteStoneWireBlock = new Block_Wire_WhiteStone(BlockIDs.BLOCK_WIRE_WHITESTONE_ID);
		YellowStoneWireBlock = new Block_Wire_YellowStone(BlockIDs.BLOCK_WIRE_YELLOWSTONE_ID);
		MagmaStoneWireBlock = new Block_Wire_MagmaStone(BlockIDs.BLOCK_WIRE_MAGMASTONE_ID);
		*/
		BlueStoneTorchIdle = new Block_Torch_BlueStone(BlockIDs.BLOCK_TORCH_BLUESTONEIDLE_ID, false);
		BlueStoneTorchActive = new Block_Torch_BlueStone(BlockIDs.BLOCK_TORCH_BLUESTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		BlackStoneTorchIdle = new Block_Torch_BlackStone(BlockIDs.BLOCK_TORCH_BLACKSTONEIDLE_ID, false);
		BlackStoneTorchActive = new Block_Torch_BlackStone(BlockIDs.BLOCK_TORCH_BLACKSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		BrownStoneTorchIdle = new Block_Torch_BrownStone(BlockIDs.BLOCK_TORCH_BROWNSTONEIDLE_ID, false);
		BrownStoneTorchActive = new Block_Torch_BrownStone(BlockIDs.BLOCK_TORCH_BROWNSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		CyanStoneTorchIdle = new Block_Torch_CyanStone(BlockIDs.BLOCK_TORCH_CYANSTONEIDLE_ID, false);
		CyanStoneTorchActive = new Block_Torch_CyanStone(BlockIDs.BLOCK_TORCH_CYANSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		GlowStoneTorchIdle = new Block_Torch_GlowStone(BlockIDs.BLOCK_TORCH_GLOWSTONEIDLE_ID, false);
		GlowStoneTorchActive = new Block_Torch_GlowStone(BlockIDs.BLOCK_TORCH_GLOWSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		GrayStoneTorchIdle = new Block_Torch_GrayStone(BlockIDs.BLOCK_TORCH_GRAYSTONEIDLE_ID, false);
		GrayStoneTorchActive = new Block_Torch_GrayStone(BlockIDs.BLOCK_TORCH_GRAYSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		GreenStoneTorchIdle = new Block_Torch_GreenStone(BlockIDs.BLOCK_TORCH_GREENSTONEIDLE_ID, false);
		GreenStoneTorchActive = new Block_Torch_GreenStone(BlockIDs.BLOCK_TORCH_GREENSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		LightBlueStoneTorchIdle = new Block_Torch_LightBlueStone(BlockIDs.BLOCK_TORCH_LIGHTBLUESTONEIDLE_ID, false);
		LightBlueStoneTorchActive = new Block_Torch_LightBlueStone(BlockIDs.BLOCK_TORCH_LIGHTBLUESTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		LightGrayStoneTorchIdle = new Block_Torch_LightGrayStone(BlockIDs.BLOCK_TORCH_LIGHTGRAYSTONEIDLE_ID, false);
		LightGrayStoneTorchActive = new Block_Torch_LightGrayStone(BlockIDs.BLOCK_TORCH_LIGHTGRAYSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		LimeGreenStoneTorchIdle = new Block_Torch_LimeGreenStone(BlockIDs.BLOCK_TORCH_LIMEGREENSTONEIDLE_ID, false);
		LimeGreenStoneTorchActive = new Block_Torch_LimeGreenStone(BlockIDs.BLOCK_TORCH_LIMEGREENSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		MagentaStoneTorchIdle = new Block_Torch_MagentaStone(BlockIDs.BLOCK_TORCH_MAGENTASTONEIDLE_ID, false);
		MagentaStoneTorchActive = new Block_Torch_MagentaStone(BlockIDs.BLOCK_TORCH_MAGENTASTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		OrangeStoneTorchIdle = new Block_Torch_OrangeStone(BlockIDs.BLOCK_TORCH_ORANGESTONEIDLE_ID, false);
		OrangeStoneTorchActive = new Block_Torch_OrangeStone(BlockIDs.BLOCK_TORCH_ORANGESTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		PinkStoneTorchIdle = new Block_Torch_PinkStone(BlockIDs.BLOCK_TORCH_PINKSTONEIDLE_ID, false);
		PinkStoneTorchActive = new Block_Torch_PinkStone(BlockIDs.BLOCK_TORCH_PINKSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		PurpleStoneTorchIdle = new Block_Torch_PurpleStone(BlockIDs.BLOCK_TORCH_PURPLESTONEIDLE_ID, false);
		PurpleStoneTorchActive = new Block_Torch_PurpleStone(BlockIDs.BLOCK_TORCH_PURPLESTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		WhiteStoneTorchIdle = new Block_Torch_WhiteStone(BlockIDs.BLOCK_TORCH_WHITESTONEIDLE_ID, false);
		WhiteStoneTorchActive = new Block_Torch_WhiteStone(BlockIDs.BLOCK_TORCH_WHITESTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		YellowStoneTorchIdle = new Block_Torch_YellowStone(BlockIDs.BLOCK_TORCH_YELLOWSTONEIDLE_ID, false);
		YellowStoneTorchActive = new Block_Torch_YellowStone(BlockIDs.BLOCK_TORCH_YELLOWSTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		MagmaStoneTorchIdle = new Block_Torch_MagmaStone(BlockIDs.BLOCK_TORCH_MAGMASTONEIDLE_ID, false);
		MagmaStoneTorchActive = new Block_Torch_MagmaStone(BlockIDs.BLOCK_TORCH_MAGMASTONEACTIVE_ID, true).setLightValue(0.5F).setCreativeTab(RedStone_a_holic.TabRSaH);
		
		/**
		 * Block-Torch GameRegistry
		 * Count: 34
		 */
		GameRegistry.registerBlock(BlueStoneTorchActive, Strings.BLOCK_TORCH_BLUESTONE_NAME);
		GameRegistry.registerBlock(BlueStoneTorchIdle, Strings.BLOCK_TORCH_BLUESTONE2_NAME);
		GameRegistry.registerBlock(BlackStoneTorchActive, Strings.BLOCK_TORCH_BLACKSTONE_NAME);
		GameRegistry.registerBlock(BlackStoneTorchIdle, Strings.BLOCK_TORCH_BLACKSTONE2_NAME);
		GameRegistry.registerBlock(BrownStoneTorchActive, Strings.BLOCK_TORCH_BROWNSTONE_NAME);
		GameRegistry.registerBlock(BrownStoneTorchIdle, Strings.BLOCK_TORCH_BROWNSTONE2_NAME);
		GameRegistry.registerBlock(CyanStoneTorchActive, Strings.BLOCK_TORCH_CYANSTONE_NAME);
		GameRegistry.registerBlock(CyanStoneTorchIdle, Strings.BLOCK_TORCH_CYANSTONE2_NAME);
		GameRegistry.registerBlock(GlowStoneTorchActive, Strings.BLOCK_TORCH_GLOWSTONE_NAME);
		GameRegistry.registerBlock(GlowStoneTorchIdle, Strings.BLOCK_TORCH_GLOWSTONE2_NAME);
		GameRegistry.registerBlock(GrayStoneTorchActive, Strings.BLOCK_TORCH_GRAYSTONE_NAME);
		GameRegistry.registerBlock(GrayStoneTorchIdle, Strings.BLOCK_TORCH_GRAYSTONE2_NAME);
		GameRegistry.registerBlock(GreenStoneTorchActive, Strings.BLOCK_TORCH_GREENSTONE_NAME);
		GameRegistry.registerBlock(GreenStoneTorchIdle, Strings.BLOCK_TORCH_GREENSTONE2_NAME);
		GameRegistry.registerBlock(LightBlueStoneTorchActive, Strings.BLOCK_TORCH_LIGHTBLUESTONE_NAME);
		GameRegistry.registerBlock(LightBlueStoneTorchIdle, Strings.BLOCK_TORCH_LIGHTBLUESTONE2_NAME);
		GameRegistry.registerBlock(LightGrayStoneTorchActive, Strings.BLOCK_TORCH_LIGHTGRAYSTONE_NAME);
		GameRegistry.registerBlock(LightGrayStoneTorchIdle, Strings.BLOCK_TORCH_LIGHTGRAYSTONE2_NAME);
		GameRegistry.registerBlock(LimeGreenStoneTorchActive, Strings.BLOCK_TORCH_LIMEGREENSTONE_NAME);
		GameRegistry.registerBlock(LimeGreenStoneTorchIdle, Strings.BLOCK_TORCH_LIMEGREENSTONE2_NAME);
		GameRegistry.registerBlock(MagentaStoneTorchActive, Strings.BLOCK_TORCH_MAGENTASTONE_NAME);
		GameRegistry.registerBlock(MagentaStoneTorchIdle, Strings.BLOCK_TORCH_MAGENTASTONE2_NAME);
		GameRegistry.registerBlock(OrangeStoneTorchActive, Strings.BLOCK_TORCH_ORANGESTONE_NAME);
		GameRegistry.registerBlock(OrangeStoneTorchIdle, Strings.BLOCK_TORCH_ORANGESTONE2_NAME);
		GameRegistry.registerBlock(PinkStoneTorchActive, Strings.BLOCK_TORCH_PINKSTONE_NAME);
		GameRegistry.registerBlock(PinkStoneTorchIdle, Strings.BLOCK_TORCH_PINKSTONE2_NAME);
		GameRegistry.registerBlock(PurpleStoneTorchActive, Strings.BLOCK_TORCH_PURPLESTONE_NAME);
		GameRegistry.registerBlock(PurpleStoneTorchIdle, Strings.BLOCK_TORCH_PURPLESTONE2_NAME);
		GameRegistry.registerBlock(WhiteStoneTorchActive, Strings.BLOCK_TORCH_WHITESTONE_NAME);
		GameRegistry.registerBlock(WhiteStoneTorchIdle, Strings.BLOCK_TORCH_WHITESTONE2_NAME);
		GameRegistry.registerBlock(YellowStoneTorchActive, Strings.BLOCK_TORCH_YELLOWSTONE_NAME);
		GameRegistry.registerBlock(YellowStoneTorchIdle, Strings.BLOCK_TORCH_YELLOWSTONE2_NAME);
		GameRegistry.registerBlock(MagmaStoneTorchActive, Strings.BLOCK_TORCH_MAGMASTONE_NAME);
		GameRegistry.registerBlock(MagmaStoneTorchIdle, Strings.BLOCK_TORCH_MAGMASTONE2_NAME);
		
		GameRegistry.registerBlock(BlueStoneWireBlock, Strings.BLOCK_WIRE_BLUESTONE_NAME);
		
		GameRegistry.registerBlock(MetaMineralBlocks, Item_Block_MetaMinerals.class,Strings.BLOCK_MINERAL_METABLOCKS_NAME);
		GameRegistry.registerBlock(ParticleBlock, Strings.BLOCK_PARTICLEBLOCK_NAME);
	}
}
