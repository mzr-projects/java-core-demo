package com.mt.javacollections;

import java.util.*;

public class JavaCollectionsApp {
	public static void main(String[] args) {
		System.out.println("======================= ArrayList");
		List<User> userList = new ArrayList<>();
		userList.add(new User("MT", "mt@gmail.com"));
		userList.add(new User("GT", "gt@gmail.com"));
		userList.add(new User("HT", "ht@gmail.com"));
		userList.forEach((element) -> System.out.println(element));

		System.out.println("======================= LinkedList");
		List<User> userLinkedList = new LinkedList<>();
		userLinkedList.add(new User("MT", "mt@gmail.com"));
		userLinkedList.add(new User("GT", "gt@gmail.com"));
		userLinkedList.add(new User("HT", "ht@gmail.com"));
		userLinkedList.forEach((element) -> System.out.println(element));

		System.out.println("======================= HashSet");
		Set<User> userHashSet = new HashSet<>();
		userHashSet.add(new User("MT", "mt@gmail.com"));
		userHashSet.add(new User("GT", "gt@gmail.com"));
		userHashSet.add(new User("MT", "mt@gmail.com"));
		userHashSet.add(new User("FT", "FT@gmail.com"));
		userHashSet.add(new User("PT", "PT@gmail.com"));
		userHashSet.add(new User("YT", "YT@gmail.com"));
		userHashSet.forEach((element) -> System.out.println(element));

		System.out.println("======================= LinkedHashSet");
		Set<User> userLinkedHashSet = new LinkedHashSet<>();
		userLinkedHashSet.add(new User("MT", "mt@gmail.com"));
		userLinkedHashSet.add(new User("GT", "gt@gmail.com"));
		userLinkedHashSet.add(new User("HT", "ht@gmail.com"));
		userLinkedHashSet.forEach((element) -> System.out.println(element));

		System.out.println("======================= TreeSet");
		Set<User> userTreeSet = new TreeSet<>();
		userTreeSet.add(new User("Xfrey", "mt@gmail.com"));
		userTreeSet.add(new User("James", "gt@gmail.com"));
		userTreeSet.add(new User("Zalatan", "ht@gmail.com"));
		userTreeSet.forEach(System.out::println);
	}
}
