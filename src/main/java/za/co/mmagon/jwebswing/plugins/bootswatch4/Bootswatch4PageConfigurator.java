package za.co.mmagon.jwebswing.plugins.bootswatch4;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

@PluginInformation(pluginName = "Bootswatch Theme Pack (V4)",
		pluginUniqueName = "bootswatch-themes",
		pluginDescription = "Free themes for Bootstrap",
		pluginVersion = "0.4.beta2",
		pluginIconUrl = "bootswatch4/logo-nav.png",
		pluginIconImageUrl = "bootswatch4/logo-nav.png",
		pluginDependancyUniqueIDs = "bootstrap 4",
		pluginCategories = "bootstrap, bootstrap4, themes",
		pluginSubtitle = "Free themes for Bootstrap",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Bootswatch4",
		pluginSourceUrl = "https://bootswatch.com",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Bootswatch4/wiki",
		pluginOriginalHomepage = "https://bootswatch.com",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/Bootswatch4.jar/download")
public class Bootswatch4PageConfigurator extends PageConfigurator
{

	private static Bootswatch4Themes theme = null;

	/**
	 * Sets the bootswatch 4 theme
	 *
	 * @return
	 */
	public static Bootswatch4Themes getTheme()
	{
		return theme;
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

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && theme != null)
		{
			page.getBody().addCssReference(theme.getCssReference());
		}
		return page;
	}
}
