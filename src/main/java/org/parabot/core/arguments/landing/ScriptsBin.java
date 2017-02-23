package org.parabot.core.arguments.landing;

import org.parabot.api.io.Directories;
import org.parabot.core.arguments.LandingArgument;

import java.io.File;

/**
 * @author EmmaStone
 */
public class ScriptsBin implements LandingArgument {

	@Override
	public String[] getArguments() {
		return new String[]{"scriptsbin"};
	}

	@Override
	public void has(Object value) {
		String[] values = value.toString().split(" ");
		int i = 0;

		Directories.setScriptCompiledDirectory(new File(values[++i]));
	}
}