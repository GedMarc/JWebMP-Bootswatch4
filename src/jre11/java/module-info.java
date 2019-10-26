module com.jwebmp.plugins.bs4.bootswatch {
	exports com.jwebmp.plugins.bs4.bootswatch;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.bootswatch.Bootswatch4PageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.bootswatch.implementations.Bootswatch4ExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4.bootswatch.implementations.Bootswatch4ExclusionsModule;

	opens com.jwebmp.plugins.bs4.bootswatch to com.fasterxml.jackson.databind, com.jwebmp.core;
}
