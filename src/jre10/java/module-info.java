import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootswatch4.Bootswatch4PageConfigurator;

module com.jwebmp.plugins.bootswatch4 {
	exports com.jwebmp.plugins.bootswatch4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides IPageConfigurator with Bootswatch4PageConfigurator;

}
