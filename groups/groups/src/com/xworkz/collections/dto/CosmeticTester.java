package com.xworkz.collections.dto;

import java.util.*;

public class CosmeticTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CosmeticDTO dto=new CosmeticDTO("Lipstick","Maybelline",599d,true,35.5d,"Maroon",true);
		CosmeticDTO dto1=new CosmeticDTO("Foundation","Loreal",899d,true,30d,"caramel",true);
		CosmeticDTO dto2=new CosmeticDTO("Kajal","Lakme",220d,true,4d,"Regal green",true);
		
		Collection<CosmeticDTO> collection=new ArrayList<CosmeticDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		
		Iterator<CosmeticDTO> iterator=collection.iterator();
		
		while (iterator.hasNext()) {
			CosmeticDTO temp = iterator.next();
			System.out.println(temp);
			if (temp != null && temp.getPrice() > 10) {
				System.out.println("price is high");
			}
		}
		CosmeticDTO ref=new CosmeticDTO("Foundation","loreal",899d,true,30d,"caramel",true);

		boolean contain = collection.contains(ref);
		System.out.println(contain);	}

}
