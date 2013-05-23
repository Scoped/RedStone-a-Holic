package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.BlockIDs;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	
	/**
	 * Block Declaration
	 * Count: 37
	 */
	
	/**
	 * Block-Block Declaration
	 * Count: 18
	 */
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
	
	/**
	 * Block-Wire Declaration
	 * Count: 1
	 */
	public static Block BlueStoneWireBlock;
	
	/**
	 * Block-Torch Declaration
	 * Count: 18
	 * Idle and Active Count: 36
	 */
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
		/**
		 * Block
		 * Count: 19
		 */
		
		/**
		 * Block-Block
		 * Count: 18
		 */
		BlueStoneBlock = new Block_Mineral_BlueStone(BlockIDs.BLOCK_BLUESTONE_ID);
		BlackStoneBlock = new Block_Mineral_BlackStone(BlockIDs.BLOCK_BLACKSTONE_ID);
		BrownStoneBlock = new Block_Mineral_BrownStone(BlockIDs.BLOCK_BROWNSTONE_ID);
		CyanStoneBlock = new Block_Mineral_CyanStone(BlockIDs.BLOCK_CYANSTONE_ID);
		GlowStoneBlock = new Block_Mineral_GlowStone(BlockIDs.BLOCK_GLOWSTONE_ID);
		GrayStoneBlock = new Block_Mineral_GrayStone(BlockIDs.BLOCK_GREYSTONE_ID);
		GreenStoneBlock = new Block_Mineral_GreenStone(BlockIDs.BLOCK_GREENSTONE_ID);
		LightBlueStoneBlock = new Block_Mineral_LightBlueStone(BlockIDs.BLOCK_LIGHTSTONE_ID);
		LightGrayStoneBlock = new Block_Mineral_LightGrayStone(BlockIDs.BLOCK_LIGHTGRAYTONE_ID);
		LimeGreenStoneBlock = new Block_Mineral_LimeGreenStone(BlockIDs.BLOCK_LIMEGREENSTONE_ID);
		MagentaStoneBlock = new Block_Mineral_MagentaStone(BlockIDs.BLOCK_MAGENTASTONE_ID);
		OrangeStoneBlock = new Block_Mineral_OrangeStone(BlockIDs.BLOCK_ORANGESTONE_ID);
		PinkStoneBlock = new Block_Mineral_PinkStone(BlockIDs.BLOCK_PINKSTONE_ID);
		PurpleStoneBlock = new Block_Mineral_PurpleStone(BlockIDs.BLOCK_PURPLESTONE);
		WhiteStoneBlock = new Block_Mineral_WhiteStone(BlockIDs.BLOCK_WHITESTONE_ID);
		YellowStoneBlock = new Block_Mineral_YellowStone(BlockIDs.BLOCK_YELLOWSTONE_ID);
		MagmaStoneBlock = new Block_Mineral_MagmaStone(BlockIDs.BLOCK_MAGMASTONE_ID);
		StrangeStoneBlock = new Block_Mineral_StrangeStone(BlockIDs.BLOCK_STRANGESTONE_ID);
		
		/**
		 * Block-Wire
		 * Count: 1
		 */
		BlueStoneWireBlock = new Block_Wire_BlueStone(BlockIDs.BLOCK_WIRE_BLUESTONE_ID);
		
		/**
		 * Block-Torch
		 * Count: 2
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
		 * Block GameRegistry
		 * Count: 36
		 */
		
		/**
		 * Block-Block GameRegistry
		 * Count: 18
		 */
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
		
		/**
		 * Block-Torch GameRegistry
		 * Count: 18
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
		
	}
}
