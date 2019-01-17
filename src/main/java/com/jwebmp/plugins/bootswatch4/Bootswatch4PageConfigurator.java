/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bootswatch4;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

@PluginInformation(pluginName = "Bootswatch Theme Pack (V4)",
		pluginUniqueName = "bootswatch-themes",
		pluginDescription = "Free themes for Bootstrap",
		pluginVersion = "0.4.beta2",
		pluginIconUrl = "bootswatch4/logo-nav.png",
		pluginIconImageUrl = "bootswatch4/logo-nav.png",
		pluginDependancyUniqueIDs = "bootstrap 4",
		pluginCategories = "bootstrap, bootstrap4, themes",
		pluginSubtitle = "Free themes for Bootstrap",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Bootswatch4",
		pluginSourceUrl = "https://bootswatch.com",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Bootswatch4/wiki",
		pluginOriginalHomepage = "https://bootswatch.com",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/Bootswatch4.jar/download")
public class Bootswatch4PageConfigurator
		implements IPageConfigurator<Bootswatch4PageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static Bootswatch4Themes theme = null;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return Bootswatch4PageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		Bootswatch4PageConfigurator.enabled = mustEnable;
	}

	/**
	 * Sets the bootswatch 4 theme
	 *
	 * @return
	 */
	public static Bootswatch4Themes getTheme()
	{
		return Bootswatch4PageConfigurator.theme;
	}

	/**
	 * Sets the bootswatch 4 theme
	 *
	 * @param theme
	 */
	public static void setTheme(Bootswatch4Themes theme)
	{
		Bootswatch4PageConfigurator.theme = theme;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && Bootswatch4PageConfigurator.theme != null)
		{
			page.getBody()
			    .addCssReference(Bootswatch4PageConfigurator.theme.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return Bootswatch4PageConfigurator.enabled;
	}
}
