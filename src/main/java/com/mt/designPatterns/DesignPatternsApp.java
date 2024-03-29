package com.mt.designPatterns;

import com.mt.designPatterns.structural.proxy.RealObject;
import com.mt.designPatterns.structural.proxy.RealObjectProxy;
import com.mt.designPatterns.creationals.singleton.SingletonBillPugh;
import com.mt.designPatterns.creationals.singleton.SingletonLazyLoading;

public class DesignPatternsApp {
	public static void main(String[] args) {
		System.out.println("================= Singleton  (Lazy Loading)");
		SingletonLazyLoading singletonLazyLoading = SingletonLazyLoading.getInstance();
		System.out.println(singletonLazyLoading);
		SingletonLazyLoading singletonLazyLoading1 = SingletonLazyLoading.getInstance();
		System.out.println(singletonLazyLoading1);

		System.out.println("================= Singleton (BillPugh Lazy Loading)");
		SingletonBillPugh singletonLazyLoading2 = SingletonBillPugh.getInstance();
		System.out.println(singletonLazyLoading2);
		SingletonBillPugh singletonLazyLoading3 = SingletonBillPugh.getInstance();
		System.out.println(singletonLazyLoading3);

		System.out.println("================= Proxy");
		RealObject realObject = new RealObjectProxy();
		realObject.doSomething();
	}
}
