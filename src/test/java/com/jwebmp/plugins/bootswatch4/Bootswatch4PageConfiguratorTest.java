package com.jwebmp.plugins.bootswatch4;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.bs4.bootswatch.Bootswatch4PageConfigurator;
import com.jwebmp.plugins.bs4.bootswatch.Bootswatch4Themes;
import org.junit.jupiter.api.Test;

class Bootswatch4PageConfiguratorTest
{

	@Test
	public void testTheme()
	{
		Page<?> p = new Page();
		Bootswatch4PageConfigurator.setTheme(Bootswatch4Themes.Cosmo);
		System.out.println(p.toString(0));
	}

}
