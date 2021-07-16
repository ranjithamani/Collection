package com.xworkz.collections.generic;

import java.util.*;

public class GenericCountryCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country1 = "India";
		String country2 = "Italy";
		String country3 = "England";
		String country4 = "USA";
		String country5 = "Bangladesh";
		String country6 = "Nepal";

		Collection<String> collection = new ArrayList<String>();
		collection.add(country1);
		collection.add(country2);
		collection.add(country3);
		collection.add(country4);
		collection.add(country5);
		collection.add(country6);

		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp.toUpperCase());
		}
	}

}
