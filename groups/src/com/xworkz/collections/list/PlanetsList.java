package com.xworkz.collections.list;

import java.util.*;

public class PlanetsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> planents = new ArrayList<String>();
		planents.add("Earth");
		planents.add("Jupiter");
		planents.add("Saturn");
		planents.add("Mars");
		planents.add("Uranus");
		planents.add("Venus");
		planents.add("Neptune");
		planents.add("Mercury");

		Collections.sort(planents);// sort()
		for (int i = 0; i < planents.size(); i++) {
			System.out.println("sorted lists:" + planents.get(i));
		}

		System.out.println("before adding:" + planents.get(4));// get()

		planents.add(4, "Pluto");// add()
		System.out.println("after adding:" + planents.get(4));// get()

		System.out.println("planets size:" + planents.size());// size()

		ListIterator<String> iterator = planents.listIterator(5);// listiterator()
		System.out.println("iterator index" + iterator.nextIndex());// nextIndex()

		while (iterator.hasPrevious()) {// hasPrevious()
			String temp = iterator.previous();// previous
			System.out.println("backward planets:" + temp);
		}

		System.out.println("calling hasnext  and next method");
		while (iterator.hasNext()) { // has next
			String temp1 = iterator.next();// next
			System.out.println("farward planets:" + temp1);
		}
		int indexOfVenus = planents.indexOf("Venus");// indexof(element)
		System.out.println("indexOfVenus:" + indexOfVenus);

		System.out.println("to array elements:" + planents.toArray());// toArray

		System.out.println("before set:" + planents.get(2));

		planents.set(2, "Sun");// set(index ,element)
		System.out.println("after set:" + planents.get(2));

		System.out.println("remove element of Mars:" + planents.remove("Mars"));// remove(element)

		System.out.println("remove element at index(3):" + planents.remove(3));// (remove index)
		System.out.println("contained element:" + planents.contains("Earth"));// contains(elemnt)
		System.out.println("sublist:" + planents.subList(0, 3));// sublist(int,int)

	}

}
