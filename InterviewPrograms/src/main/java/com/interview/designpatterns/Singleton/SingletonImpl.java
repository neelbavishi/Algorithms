package com.interview.designpatterns.Singleton;

public class SingletonImpl {
	private static SingletonImpl uniqInstance;

	private SingletonImpl() {
	}

	public static synchronized SingletonImpl getInstance() {
		if (uniqInstance == null) {
			uniqInstance = new SingletonImpl();
		}
		return uniqInstance;
	}
	// other useful methods here
} 
