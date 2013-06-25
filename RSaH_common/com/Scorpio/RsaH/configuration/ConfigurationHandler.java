package com.Scorpio.RsaH.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Scorpio.RsaH.lib.BlockIDs;
import com.Scorpio.RsaH.lib.ItemIDs;
import com.Scorpio.RsaH.lib.Reference;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler
{
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		try
		{
			config.load();
			
			BlockIDs.BLOCK_MINERAL_METABLOCKS_ID = config.getBlock(Strings.BLOCK_MINERAL_METABLOCKS_NAME, BlockIDs.BLOCK_MINERAL_METABLOCKS_ID_DEFAULT).getInt(BlockIDs.BLOCK_MINERAL_METABLOCKS_ID_DEFAULT);
			BlockIDs.BLOCK_TORCH_IDLE_METABLOCKS_ID = config.getBlock(Strings.BLOCK_TORCH_IDLE_METABLOCKS_NAME, BlockIDs.BLOCK_TORCH_IDLE_METABLOCKS_ID_DEFAULT).getInt(BlockIDs.BLOCK_TORCH_IDLE_METABLOCKS_ID_DEFAULT);
			BlockIDs.BLOCK_TORCH_ACTIVE_METABLOCKS_ID = config.getBlock(Strings.BLOCK_TORCH_METABLOCKS_NAME, BlockIDs.BLOCK_TORCH_ACTIVE_METABLOCKS_ID_DEFAULT).getInt(BlockIDs.BLOCK_TORCH_ACTIVE_METABLOCKS_ID_DEFAULT);
			BlockIDs.BLOCK_PARTICLEBLOCK_ID = config.getBlock(Strings.BLOCK_PARTICLEBLOCK_NAME, BlockIDs.BLOCK_PARTICLEBLOCK_ID_DEFAULT).getInt(BlockIDs.BLOCK_PARTICLEBLOCK_ID_DEFAULT);
			
			/**
			 * Block-Wire Configuration
			 */
			BlockIDs.BLOCK_WIRE_BLUESTONE_ID = config.getBlock(Strings.BLOCK_WIRE_BLUESTONE_NAME, BlockIDs.BLOCK_WIRE_BLUESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_WIRE_BLUESTONE_ID_DEFAULT);
			
			/**
			 * Item Configuration
			 */
			ItemIDs.ITEM_DUST_BLUESTONE_ID = config.getItem(Strings.ITEM_DUST_BLUESTONE_NAME, ItemIDs.ITEM_DUST_BLUESTONE_ID_DEFAULT).getInt(ItemIDs.ITEM_DUST_BLUESTONE_ID_DEFAULT);
			
		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the cofig file!");
		}
		finally
		{
			config.save();
		}
	}
}
