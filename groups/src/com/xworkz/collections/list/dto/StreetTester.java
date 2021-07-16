package com.xworkz.collections.list.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StreetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreetDTO street = new StreetDTO("FormRoad", 560096, "Anupublic School", "Bangalore");
		StreetDTO street1 = new StreetDTO("RingRoad", 560096, "Nandini Bekary", "Bangalore");
		StreetDTO street2 = new StreetDTO("SP", 566096, "Bsava Temple", "Bangalore");

		List<StreetDTO> list = new ArrayList<StreetDTO>();
		list.add(street);
		list.add(street1);
		list.add(street2);

		System.out.println("list size:" + list.size());// size

		System.out.println("before set:" + list.get(1));

		list.set(1, street1);

		ListIterator<StreetDTO> iterator = list.listIterator();
		while (iterator.hasNext()) {// hasNext()
			StreetDTO temp = iterator.next();// next()
			System.out.println(temp);
		}

		StreetDTO value = new StreetDTO("SP", 566096, "Bsava Temple", "Bangalore");
		boolean contain = list.contains(value);// contain()
		System.out.println("contain:" + contain);
		System.out.println("contain all element:" + list.containsAll(list));// containAll

		System.out.println("size before remove:" + list.size());// size
		System.out.println("removed element:" + list.remove(street1));// remove(element)
		System.out.println("size after removed:" + list.size());// size

		System.out.println("before set:" + list.get(1));
		StreetDTO anotherStreet = new StreetDTO("MG", 566096, "BurgerKing", "Bangalore");
		list.set(1, anotherStreet);// set(index element)
		System.out.println("after set:" + list.get(1));
		System.out.println("removed element:" + list.removeAll(list));// removeAll(element)

	}

}
