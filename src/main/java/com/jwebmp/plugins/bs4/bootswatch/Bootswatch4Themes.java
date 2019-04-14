/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bs4.bootswatch;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.htmlbuilder.css.themes.ITheme;

import java.util.Collections;
import java.util.List;

/**
 * All the themes for bootswatch 4
 */
public enum Bootswatch4Themes
		implements ITheme
{
	Cerulean("bower_components/bootswatch/dist/cerulean/bootstrap.min.css"),
	Cosmo("bower_components/bootswatch/dist/cosmo/bootstrap.min.css"),
	Cyborg("bower_components/bootswatch/dist/cyborg/bootstrap.min.css"),
	Darkly("bower_components/bootswatch/dist/darkly/bootstrap.min.css"),
	Flatly("bower_components/bootswatch/dist/flatly/bootstrap.min.css"),
	Journal("bower_components/bootswatch/dist/journal/bootstrap.min.css"),
	Litera("bower_components/bootswatch/dist/litera/bootstrap.min.css"),
	lumen("bower_components/bootswatch/dist/lumen/bootstrap.min.css"),
	Lux("bower_components/bootswatch/dist/lux/bootstrap.min.css"),
	Materia("bower_components/bootswatch/dist/materia/bootstrap.min.css"),
	Minty("bower_components/bootswatch/dist/minty/bootstrap.min.css"),
	Pulse("bower_components/bootswatch/dist/pulse/bootstrap.min.css"),
	Sandstone("bower_components/bootswatch/dist/sandstone/bootstrap.min.css"),
	Simplex("bower_components/bootswatch/dist/simplex/bootstrap.min.css"),
	Sketchy("bower_components/bootswatch/dist/sketchy/bootstrap.min.css"),
	Slate("bower_components/bootswatch/dist/slate/bootstrap.min.css"),
	Solar("bower_components/bootswatch/dist/solar/bootstrap.min.css"),
	Spacelab("bower_components/bootswatch/dist/spacelab/bootstrap.min.css"),
	Superhero("bower_components/bootswatch/dist/superhero/bootstrap.min.css"),
	United("bower_components/bootswatch/dist/united/bootstrap.min.css"),
	Yeti("bower_components/bootswatch/dist/yeti/bootstrap.min.css");

	private String cssLocation;

	Bootswatch4Themes(String cssLocation)
	{
		this.cssLocation = cssLocation;
	}

	@Override
	public String getClassName()
	{
		return "bootswatch4";
	}

	@Override
	public List<CSSReference> getCssReferences()
	{
		return Collections.singletonList(getCssReference());
	}

	protected CSSReference getCssReference()
	{
		return new CSSReference(name() + "CSS", 1.0, cssLocation).setSpecifiedClassName("bootswatch4");
	}

	@Override
	public List<JavascriptReference> getJavascriptReferences()
	{
		return null;
	}

	@Override
	public String getSize30Icon()
	{
		return null;
	}

	@Override
	public String getSize60Icon()
	{
		return null;
	}

	@Override
	public String getSize90Icon()
	{
		return null;
	}

	@Override
	public String getName()
	{
		return name();
	}
}
