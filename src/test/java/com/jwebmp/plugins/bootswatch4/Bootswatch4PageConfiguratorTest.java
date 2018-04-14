package com.jwebmp.plugins.bootswatch4;

import com.jwebmp.Page;
import org.junit.jupiter.api.Test;

class Bootswatch4PageConfiguratorTest
{

	@Test
	public void testTheme()
	{
		Page p = new Page();
		Bootswatch4PageConfigurator.setTheme(Bootswatch4Themes.Cosmo);
		System.out.println(p.toString(0));
	}

}
