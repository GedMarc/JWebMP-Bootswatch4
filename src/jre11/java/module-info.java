module com.jwebmp.plugins.bootswatch4 {
	exports com.jwebmp.plugins.bootswatch4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootswatch4.Bootswatch4PageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootswatch4.implementations.Bootswatch4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootswatch4.implementations.Bootswatch4ExclusionsModule;

	opens com.jwebmp.plugins.bootswatch4 to com.fasterxml.jackson.databind, com.jwebmp.core;
}
