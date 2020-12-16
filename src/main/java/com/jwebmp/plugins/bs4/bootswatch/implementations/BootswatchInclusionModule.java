package com.jwebmp.plugins.bs4.bootswatch.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BootswatchInclusionModule implements IGuiceScanModuleInclusions<BootswatchInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bs4.bootswatch");
		return set;
	}
}
