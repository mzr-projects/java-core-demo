package com.mt.designPatterns.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SingletonLazyLoading implements Serializable {

	private static volatile SingletonLazyLoading INSTANCE = null;

	private SingletonLazyLoading() {

	}

	public static SingletonLazyLoading getInstance() {

		if (INSTANCE == null) {
			synchronized (SingletonLazyLoading.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyLoading();
				}
			}
		}

		return INSTANCE;
	}

	@Serial
	protected Object readResolve(){
		return INSTANCE;
	}
}
