package com.Scorpio.RsaH.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block BlueStoneBlock;
	/*
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
	*/
	public static void BlocksInit()
	{
		BlueStoneBlock = new BlueStoneBlock(3100);
		/*
		BlackStoneBlock = new BlackStoneBlock(3101);
		BrownStoneBlock = new BrownStoneBlock(3102);
		CyanStoneBlock = new CyanStoneBlock(3103);
		GlowStoneBlock = new GlowStoneBlock(3104);
		GrayStoneBlock = new GrayStoneBlock(3105);
		GreenStoneBlock = new GreenStoneBlock(3106);
		LightBlueStoneBlock = new LightBlueStoneBlock(3107);
		LightGrayStoneBlock = new LightGrayStoneBlock(3108);
		LimeGreenStoneBlock = new LimeGreenStoneBlock(3109);
		MagentaStoneBlock = new MagentaStoneBlock(3110);
		OrangeStoneBlock = new OrangeStoneBlock(3111);
		PinkStoneBlock = new PinkStoneBlock(3112);
		PurpleStoneBlock = new PurpleStoneBlock(3113);
		WhiteStoneBlock = new WhiteStoneBlock(3114);
		YellowStoneBlock = new YellowStoneBlock(3115);
		MagmaStoneBlock = new MagmaStoneBlock(3116);
		 */
		
		GameRegistry.registerBlock(BlueStoneBlock);
	}
}
