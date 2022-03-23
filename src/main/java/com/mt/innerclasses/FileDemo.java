package com.mt.innerclasses;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("src/main/java/com/mt/innerclasses");
		for (String name : Objects.requireNonNull(file.list())) {
			System.out.println(name);
		}

		System.out.println("=========== Only Java Files");
		for (String name : Objects.requireNonNull(file.list(new OnlyJavaFiles()))) {
			System.out.println(name);
		}

		System.out.println("========== Anonymous InnerClass Only text files");
		for (String name : file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		})) {
			System.out.println(name);
		}
	}
}
