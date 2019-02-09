import com.jwebmp.plugins.bs4.bootswatch.Bootswatch4PageConfigurator;

module com.jwebmp.plugins.bs4.bootswatch {
	exports com.jwebmp.plugins.bs4.bootswatch;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with Bootswatch4PageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.bootswatch.implementations.Bootswatch4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4.bootswatch.implementations.Bootswatch4ExclusionsModule;

	opens com.jwebmp.plugins.bs4.bootswatch to com.fasterxml.jackson.databind, com.jwebmp.core;
}
