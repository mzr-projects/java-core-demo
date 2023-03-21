package com.mt.advanced.serialization;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyJavaFiles implements FilenameFilter {
	@Override
	public boolean accept(File pathname, String name) {
		return name.endsWith(".java");
	}
}
