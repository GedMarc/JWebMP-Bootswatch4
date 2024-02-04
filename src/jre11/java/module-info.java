import com.jwebmp.plugins.bs4.bootswatch.implementations.BootswatchInclusionModule;

module com.jwebmp.plugins.bs4.bootswatch {
	exports com.jwebmp.plugins.bs4.bootswatch;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.bootswatch.Bootswatch4PageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.bootswatch.implementations.Bootswatch4ExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BootswatchInclusionModule;
	
	opens com.jwebmp.plugins.bs4.bootswatch to com.fasterxml.jackson.databind, com.jwebmp.core;
}
