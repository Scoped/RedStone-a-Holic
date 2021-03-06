package com.Scorpio.RsaH;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.Scorpio.RsaH.block.ModBlocks;
import com.Scorpio.RsaH.configuration.ConfigurationHandler;
import com.Scorpio.RsaH.core.handler.LocalizationHandler;
import com.Scorpio.RsaH.core.proxy.CommonProxy;
import com.Scorpio.RsaH.creativeTab.TabRSaH;
import com.Scorpio.RsaH.item.ModItems;
import com.Scorpio.RsaH.lib.Reference;
import com.Scorpio.RsaH.recipes.ModRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

	@Mod(
		modid = Reference.MOD_ID ,
		name = Reference.MOD_NAME,
		version = Reference.VERSION)
	
	@NetworkMod(
		channels = (Reference.CHANNEL_NAME),
		serverSideRequired = false,
		clientSideRequired = true)

public class RedStone_a_holic
{
	
	@SidedProxy(
		clientSide = Reference.CLIENT_PROXY_LOCATION,
		serverSide = Reference.COMMON_PROXY_LOCATION)
	
	public static CommonProxy proxy;
	
	public static CreativeTabs TabRSaH = new TabRSaH(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsoluteFile() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
		
		LocalizationHandler.loadLanguages();
		
		ModBlocks.BlocksInit();
		
		ModItems.ItemInit();
		
		ModRecipes.recipesInit();
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
