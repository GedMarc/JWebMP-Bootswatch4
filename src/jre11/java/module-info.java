import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootswatch4.Bootswatch4PageConfigurator;
import com.jwebmp.plugins.bootswatch4.implementations.Bootswatch4ExclusionsModule;

module com.jwebmp.plugins.bootswatch4 {
	exports com.jwebmp.plugins.bootswatch4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with Bootswatch4PageConfigurator;
	provides IGuiceScanModuleExclusions with Bootswatch4ExclusionsModule;
	provides IGuiceScanJarExclusions with Bootswatch4ExclusionsModule;

	opens com.jwebmp.plugins.bootswatch4 to com.fasterxml.jackson.databind, com.jwebmp.core;
}
