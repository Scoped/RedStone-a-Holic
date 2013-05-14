package com.Scorpio.RsaH;

import com.Scorpio.RsaH.block.ModBlocks;
import com.Scorpio.RsaH.core.handler.LocalizationHandler;
import com.Scorpio.RsaH.core.proxy.CommonProxy;
import com.Scorpio.RsaH.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * RedStone-a-Holic
 * 
 * RedStone-a-Holic
 * 
 * @author Scorpio
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(
		modid= Reference.MOD_ID ,
		name = Reference.MOD_NAME,
		version = Reference.VERSION)

@NetworkMod(
		serverSideRequired = false,
		clientSideRequired = true)

public class RedStone_a_holic
{
	
	@SidedProxy(
		clientSide = Reference.CLIENT_PROXY_LOCATION,
		serverSide = Reference.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.BlocksInit();
		
		LocalizationHandler.loadLanguages();
	}
	@Init
	public void init(FMLInitializationEvent event)
	{
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
