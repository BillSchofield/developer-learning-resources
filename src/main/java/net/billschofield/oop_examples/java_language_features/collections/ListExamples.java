package net.billschofield.oop_examples.java_language_features.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {


	public static void main(String[] args) {
		arrayList();
		linkedList();
	}

	private static void arrayList() {
		/* ArrayLists are implemented as arrays that get resized to make room
		and parts of them are moved "down" to make room when a new item is
		inserted in the middle.


		_______________________________________
		| "first" | "third" | ------ | ------ |
		---------------------------------------

		arrayList.add(1,"second");

		Move part of the list right to make room for inserted element
		_______________________________________
		| "first" | ------ | "third" | ------ |
		---------------------------------------

		Insert element into new empty space
		_________________________________________
		| "first" | "second" | "third" | ------ |
		-----------------------------------------

		What happens when there's not enough room for the new element?


		 */

		var arrayList = new ArrayList<String>();
		System.out.println(arrayList.size());
		arrayList.add("first");
		System.out.println(arrayList.size());

		arrayList.add("third");
		System.out.println(arrayList);

		// How does this work?
		arrayList.add(1,"second");
		System.out.println(arrayList);

		arrayList.clear();

		// This is slooow
		addAMillionAtTheFront(arrayList);

		// This is fast
		arrayList.get(500000);
	}
	private static void linkedList() {
		/*

		Linked lists nodes that are linked together to form a list. The Java
		implementation looks like this:

		            First Node      Second Node
		(first) --->| prev |<-------| prev |<--- (last)
					| item |        | item |
					| next | ------>| next |

		 */


		var linkedList = new LinkedList<String>();

		System.out.println(linkedList.size());
		linkedList.add("first");
		System.out.println(linkedList.size());

		linkedList.add("third");
		System.out.println(linkedList);

		// How does this work?
		linkedList.add(1,"second");
		System.out.println(linkedList);

		linkedList.clear();

		// This is fast
		addAMillionAtTheFront(linkedList);

		// This is slooow
		linkedList.get(500000);
	}

	private static void addAMillionAtTheFront(List<String> list) {
		for (int i = 0; i < 1000000; i++) {
			list.add(0,i + "");
		}
	}
}
