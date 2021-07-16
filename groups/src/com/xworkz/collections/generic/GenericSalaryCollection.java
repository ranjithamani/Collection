package com.xworkz.collections.generic;

import java.util.*;

public class GenericSalaryCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary1 = 500;
		double salary2 = 4000;
		double salary3 = 13000;
		double salary4 = 15000;

		Collection<Double> collection = new ArrayList<Double>();
		collection.add(salary1);
		collection.add(salary2);
		collection.add(salary3);
		collection.add(salary4);

		Iterator<Double> itr = collection.iterator();

		while (itr.hasNext()) {
			double salary = itr.next();
			System.out.println(salary);

			if (salary > 1000 && salary < 5000) {
				System.out.println("good salary");
			}
			if (salary < 1000) {
				System.out.println(" not good salary");

			}
			if (salary > 5000) {
				System.out.println(" greate salary");
			}
		}
	}
}
