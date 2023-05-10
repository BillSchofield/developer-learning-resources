package developer_learning_resources.languages_and_frameworks.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {


	public static void main(String[] args) {
		arrayList();
		linkedList();
	}

	private static void arrayList() {
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
