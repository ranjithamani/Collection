package com.xworkz.collections.list.dto;

import java.util.*;

public class LipstickTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LipstickDTO dto = new LipstickDTO("Maybilline", 599d, 35.5d, true, "Maroon");
		LipstickDTO dto1 = new LipstickDTO("Mac", 699d, 35.5d, true, "Red Letter");
		LipstickDTO dto2 = new LipstickDTO("Lakme", 499d, 35.5d, true, "Pink pop");

		List<LipstickDTO> list = new ArrayList<LipstickDTO>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);

		System.out.println("list size:" + list.size());// size

		System.out.println("before set:" + list.get(1));

		list.set(1, dto);

		ListIterator<LipstickDTO> iterator = list.listIterator();
		while (iterator.hasNext()) {// hasNext()
			LipstickDTO temp = iterator.next();// next()
			System.out.println(temp);
		}

		LipstickDTO value = new LipstickDTO("Lakme", 499d, 35.5d, true, "Pink pop");
		boolean contain = list.contains(value);// contain()
		System.out.println("contain:" + contain);
		System.out.println("contain all element:" + list.containsAll(list));// containAll

		System.out.println("size before remove:" + list.size());// size
		System.out.println("removed element:" + list.remove(dto1));// remove(element)
		System.out.println("size after removed:" + list.size());// size

		System.out.println("before set:" + list.get(1));
		LipstickDTO another = new LipstickDTO("Lotus", 699d, 30.5d, true, "Pink Mcaron");
		list.set(1, another);// set(index element)
		System.out.println("after set:" + list.get(1));
		System.out.println("removed element:" + list.removeAll(list));// removeAll(element)

	}

}
