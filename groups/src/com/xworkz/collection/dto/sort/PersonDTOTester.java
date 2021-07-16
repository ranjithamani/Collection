package com.xworkz.collection.dto.sort;

import java.util.*;

public class PersonDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDTO dto1 = new PersonDTO("Ranjitha", 15, "ranjitham.xworkz@gmail.com");
		PersonDTO dto2 = new PersonDTO("Sunitha", 14, "sunitha.xworkz@gmail.com");
		PersonDTO dto3 = new PersonDTO("Harshitha", 13, "harshitha.xworkz@gmail.com");
		PersonDTO dto4 = new PersonDTO("Pavithra", 11, "pavitra.xworkz@gmail.com");
		PersonDTO dto5 = new PersonDTO("Vishnavi", 10, "vishnavi.xworkz@gmail.com");

		List<PersonDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		
		Collections.sort(list);

		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
			System.out.println(personDTO.getAge());
		}
	}

}
