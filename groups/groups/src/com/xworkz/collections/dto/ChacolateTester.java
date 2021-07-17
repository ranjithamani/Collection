package com.xworkz.collections.dto;

import java.util.*;

public class ChacolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateDTO dto = new ChocolateDTO("Mangobite", 1d, "mango", true, true, true);
		ChocolateDTO dt1 = new ChocolateDTO("Dairymilk", 10d, "oreo", true, true, true);
		ChocolateDTO dt2 = new ChocolateDTO("Temptation", 150d, "Almond", true, true, true);
		Collection<ChocolateDTO> collection = new ArrayList<ChocolateDTO>();
		collection.add(dto);
		collection.add(dt1);
		collection.add(dt2);

		Iterator<ChocolateDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			ChocolateDTO temp = iterator.next();
			System.out.println(temp);
			if (temp != null && temp.getPrice() > 10) {
				System.out.println("price is high");
			}
		}
		ChocolateDTO value = new ChocolateDTO("Dairymilk", 10d, "oreo", true, true, true);

		boolean contain = collection.contains(value);
		System.out.println(contain);
	}

}
