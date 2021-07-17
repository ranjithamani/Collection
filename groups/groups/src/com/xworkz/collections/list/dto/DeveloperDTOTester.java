package com.xworkz.collections.list.dto;

import java.util.*;

public class DeveloperDTOTester {

	public static void main(String[] args) {

		DeveloperDTO value = new DeveloperDTO();//creating object for comparator super type

		DeveloperDTO developer1 = new DeveloperDTO("Ranjitha", 24, "FullStack", 3.7d, 0.4d);
		DeveloperDTO developer2 = new DeveloperDTO("Harshitha", 22, "FullStack", 3.5d, 0.4d);
		DeveloperDTO developer3 = new DeveloperDTO("Sunitha", 23, "FullStack", 4d, 0.4d);
		DeveloperDTO developer4 = new DeveloperDTO("Sunil", 26, "FullStack", 3.6d, 0.4d);
		DeveloperDTO developer5 = new DeveloperDTO("Pavitra", 21, "FullStack", 3.4d, 0.4d);

		List<DeveloperDTO> temp = new ArrayList<DeveloperDTO>();
		temp.add(developer1);
		temp.add(developer2);
		temp.add(developer3);
		temp.add(developer4);
		temp.add(developer5);

		System.out.println(temp.size());

		Collections.sort(temp, value);// List type ref and comparator-- super type(default constr of base class
//(List<T> ,comparator super type<T>)
		for (DeveloperDTO list : temp) {
			System.out.println(list);
			System.out.println(list.getAge());

		}

	}

}
