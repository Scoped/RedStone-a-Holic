package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;

import com.Scorpio.RsaH.item.Item_Block_MetaMinerals;
import com.Scorpio.RsaH.item.Item_Block_MetaTorches;
import com.Scorpio.RsaH.item.Item_Block_MetaTorchesIdle;
import com.Scorpio.RsaH.lib.BlockIDs;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	
	public static Block MetaMineralBlocks;
	public static Block MetaTorchIdleBlocks;
	public static Block MetaTorchActiveBlocks;
	public static Block ParticleBlock;
	public static Block BlueStoneWireBlock;
	public static int modelWireID;
	
	public static void BlocksInit()
	{
		MetaMineralBlocks = new Block_Meta_Minerals(BlockIDs.BLOCK_MINERAL_METABLOCKS_ID);
		MetaTorchActiveBlocks = new Block_Meta_Torch(BlockIDs.BLOCK_TORCH_ACTIVE_METABLOCKS_ID, true).setLightValue(0.5F);
		MetaTorchIdleBlocks = new Block_Meta_TorchIdle(BlockIDs.BLOCK_TORCH_IDLE_METABLOCKS_ID, false);
		ParticleBlock = new Block_ParticalBlock(BlockIDs.BLOCK_PARTICLEBLOCK_ID).setLightValue(1.0F);
		BlueStoneWireBlock = new Block_Wire_BlueStone(BlockIDs.BLOCK_WIRE_BLUESTONE_ID);
		
		GameRegistry.registerBlock(MetaMineralBlocks, Item_Block_MetaMinerals.class,Strings.BLOCK_MINERAL_METABLOCKS_NAME);
		GameRegistry.registerBlock(MetaTorchIdleBlocks, Item_Block_MetaTorchesIdle.class, Strings.BLOCK_TORCH_IDLE_METABLOCKS_NAME);
		GameRegistry.registerBlock(MetaTorchActiveBlocks, Item_Block_MetaTorches.class, Strings.BLOCK_TORCH_METABLOCKS_NAME);
		
		GameRegistry.registerBlock(ParticleBlock, Strings.BLOCK_PARTICLEBLOCK_NAME);
	}
}
