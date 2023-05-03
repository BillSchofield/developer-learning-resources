package net.billschofield.oop_examples.java_language_features.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SetExamples {
	public static void main(String[] args) {
		addDupes(new ArrayList<>());
		var hashSet = new HashSet<String>();
		addDupes(hashSet);
	}

	private static void addDupes(Collection<String> collection) {
		System.out.println(collection.getClass().toString());

		collection.add("first");
		System.out.println(collection.size());

		collection.add("first");
		System.out.println(collection.size());

		collection.add("second");
		System.out.println(collection.size());
	}
}
