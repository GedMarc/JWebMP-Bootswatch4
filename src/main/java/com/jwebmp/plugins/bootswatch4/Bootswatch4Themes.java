/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootswatch4;

import com.jwebmp.core.base.references.CSSReference;

/**
 * All the themes for bootswatch 4
 */
public enum Bootswatch4Themes
{
	Cerulean("bootswatch4/Cerulean/bootstrap.min.css"),
	Cosmo("bootswatch4/Cosmo/bootstrap.min.css"),
	Cyborg("bootswatch4/Cyborg/bootstrap.min.css"),
	Darkly("bootswatch4/Darkly/bootstrap.min.css"),
	Flatly("bootswatch4/Flatly/bootstrap.min.css"),
	Journal("bootswatch4/Journal/bootstrap.min.css"),
	Litera("bootswatch4/Litera/bootstrap.min.css"),
	lumen("bootswatch4/lumen/bootstrap.min.css"),
	Lux("bootswatch4/Lux/bootstrap.min.css"),
	Materia("bootswatch4/Materia/bootstrap.min.css"),
	Minty("bootswatch4/Minty/bootstrap.min.css"),
	Pulse("bootswatch4/Pulse/bootstrap.min.css"),
	Sandstone("bootswatch4/Sandstone/bootstrap.min.css"),
	Simplex("bootswatch4/Simplex/bootstrap.min.css"),
	Sketchy("bootswatch4/Sketchy/bootstrap.min.css"),
	Slate("bootswatch4/Slate/bootstrap.min.css"),
	Solar("bootswatch4/Solar/bootstrap.min.css"),
	Spacelab("bootswatch4/Spacelab/bootstrap.min.css"),
	Superhero("bootswatch4/Superhero/bootstrap.min.css"),
	United("bootswatch4/United/bootstrap.min.css"),
	Yeti("bootswatch4/Yeti/bootstrap.min.css");

	private String cssLocation;

	Bootswatch4Themes(String cssLocation)
	{
		this.cssLocation = cssLocation;
	}

	protected CSSReference getCssReference()
	{
		return new CSSReference(name() + "CSS", 1.0, cssLocation).setSpecifiedClassName("bootswatch4");
	}
}
