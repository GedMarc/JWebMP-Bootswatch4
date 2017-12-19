package za.co.mmagon.jwebswing.plugins.bootswatch4;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.Page;

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
