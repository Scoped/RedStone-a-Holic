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
