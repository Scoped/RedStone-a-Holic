package com.Scorpio.RsaH.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper
{
	public static boolean isXMLLanguageFile(String fileName)
	{
		return fileName.endsWith(".xml");
	}
	
	public static String getLocalFromFileName(String fileName)
	{
		return fileName.substring(fileName.lastIndexOf("/")+1, fileName.lastIndexOf("."));
	}
	public static String letLocalizationString(String key)
	{
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}
