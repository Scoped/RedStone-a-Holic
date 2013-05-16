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
			
			BlockIDs.BLOCK_BLUESTONE_ID = config.getBlock(Strings.BLOCK_BLUESTONE_NAME, BlockIDs.BLOCK_BLUESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_BLUESTONE_ID_DEFAULT);
			BlockIDs.BLOCK_BLACKSTONE_ID = config.getBlock(Strings.BLOCK_BLACKSTONE_NAME, BlockIDs.BLOCK_BLACKSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_BLACKSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_BROWNSTONE_ID = config.getBlock(Strings.BLOCK_BROWNSTONE_NAME, BlockIDs.BLOCK_BROWNSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_BROWNSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_CYANSTONE_ID = config.getBlock(Strings.BLOCK_CYANSTONE_NAME, BlockIDs.BLOCK_CYANSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_CYANSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_GLOWSTONE_ID = config.getBlock(Strings.BLOCK_GLOWSTONE_NAME, BlockIDs.BLOCK_GLOWSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_GLOWSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_GREYSTONE_ID = config.getBlock(Strings.BLOCK_GRAYSTONE_NAME, BlockIDs.BLOCK_GREYSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_GREYSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_GREENSTONE_ID = config.getBlock(Strings.BLOCK_GREENSTONE_NAME, BlockIDs.BLOCK_GREENSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_GREENSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_LIGHTSTONE_ID = config.getBlock(Strings.BLOCK_LIGHTBLUESTONE_NAME, BlockIDs.BLOCK_LIGHTBLUESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_LIGHTBLUESTONE_ID_DEFAULT);
			BlockIDs.BLOCK_LIGHTGRAYTONE_ID = config.getBlock(Strings.BLOCK_LIGHTGRAYSTONE_NAME, BlockIDs.BLOCK_LIGHTGRAYTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_LIGHTGRAYTONE_ID_DEFAULT);
			BlockIDs.BLOCK_LIMEGREENSTONE_ID = config.getBlock(Strings.BLOCK_LIMEGREENSTONE_NAME, BlockIDs.BLOCK_LIMEGREENSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_LIMEGREENSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_MAGENTASTONE_ID = config.getBlock(Strings.BLOCK_MAGENTASTONE_NAME, BlockIDs.BLOCK_MAGENTASTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_MAGENTASTONE_ID_DEFAULT);
			BlockIDs.BLOCK_ORANGESTONE_ID = config.getBlock(Strings.BLOCK_ORANGESTONE_NAME, BlockIDs.BLOCK_ORANGESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_ORANGESTONE_ID_DEFAULT);
			BlockIDs.BLOCK_PINKSTONE_ID = config.getBlock(Strings.BLOCK_PINKSTONE_NAME, BlockIDs.BLOCK_PINKSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_PINKSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_PURPLESTONE = config.getBlock(Strings.BLOCK_PURPLESTONE_NAME, BlockIDs.BLOCK_PURPLESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_PURPLESTONE_ID_DEFAULT);
			BlockIDs.BLOCK_WHITESTONE_ID = config.getBlock(Strings.BLOCK_WHITESTONE_NAME, BlockIDs.BLOCK_WHITESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_WHITESTONE_ID_DEFAULT);
			BlockIDs.BLOCK_YELLOWSTONE_ID = config.getBlock(Strings.BLOCK_YELLOWSTONE_NAME, BlockIDs.BLOCK_YELLOWSTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_YELLOWSTONE_ID_DEFAULT);
			BlockIDs.BLOCK_MAGMASTONE_ID = config.getBlock(Strings.BLOCK_MAGMASTONE_NAME, BlockIDs.BLOCK_MAGMASTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_MAGMASTONE_ID_DEFAULT);
			BlockIDs.BLOCK_STRANGESTONE_ID = config.getBlock(Strings.BLOCK_STRANGESTONE_NAME, BlockIDs.BLOCK_STRANGESTONE_ID_DEFAULT).getInt(BlockIDs.BLOCK_STRANGESTONE_ID_DEFAULT);
			
			ItemIDs.DUST_BLUESTONE_ID = config.getItem(Strings.DUST_BLUESTONE_NAME, ItemIDs.DUST_BLUESTONE_ID_DEFAULT).getInt(ItemIDs.DUST_BLUESTONE_ID_DEFAULT);
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
