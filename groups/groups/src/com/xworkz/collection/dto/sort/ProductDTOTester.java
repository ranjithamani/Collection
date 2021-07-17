package com.xworkz.collection.dto.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDTO dto1=new ProductDTO("Puliyogare","MTR",150d,250d);
		ProductDTO dto2=new ProductDTO("Maggie","Nestle",12d,50d);
		ProductDTO dto3=new ProductDTO("Cadbury","Silk",50d,25d);
		ProductDTO dto4=new ProductDTO("Gulaab Jamoon","Swastik",100d,250d);
		ProductDTO dto5=new ProductDTO("Light Complete","Garnier",125d,45d);
		
		List<ProductDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		
		Collections.sort(list);

		for (ProductDTO product : list) {
			System.out.println(product);
			System.out.println(product.getPrice());

		}
	}

}
