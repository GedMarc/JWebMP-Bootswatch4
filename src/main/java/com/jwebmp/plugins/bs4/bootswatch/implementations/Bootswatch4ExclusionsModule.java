package com.jwebmp.plugins.bs4.bootswatch.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Bootswatch4ExclusionsModule
		implements IGuiceScanModuleExclusions<Bootswatch4ExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootswatch4");
		return strings;
	}
}
