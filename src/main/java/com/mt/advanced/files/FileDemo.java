package com.mt.advanced.files;

import java.io.File;
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
		for (String name : Objects.requireNonNull(file.list((dir, name) -> name.endsWith(".txt")))) {
			System.out.println(name);
		}
	}
}
