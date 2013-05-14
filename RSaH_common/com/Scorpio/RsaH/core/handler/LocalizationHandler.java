package com.Scorpio.RsaH.core.handler;

import com.Scorpio.RsaH.core.helper.LocalizationHelper;
import com.Scorpio.RsaH.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler
{
	public static void loadLanguages()
	{
		for(String LocationFile: Localizations.localFiles)
			LanguageRegistry.instance().loadLocalization(LocationFile, LocalizationHelper.getLocalFromFileName(LocationFile), LocalizationHelper.isXMLLanguageFile(LocationFile));
	}
}
