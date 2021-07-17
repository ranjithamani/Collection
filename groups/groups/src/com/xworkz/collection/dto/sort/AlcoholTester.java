package com.xworkz.collection.dto.sort;
import java.util.*;

import com.xworkz.collection.dto.constants.*;

public class AlcoholTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlcoholDTO dto1=new AlcoholDTO("Officers Choice",300d,true,750d,AlcoholType.WHISKEY);
		AlcoholDTO dto2=new AlcoholDTO("Royal Stag",973d,true,750d,AlcoholType.WHISKEY);
		AlcoholDTO dto3=new AlcoholDTO("Imperial Blue",671d,true,750d,AlcoholType.WHISKEY);
		AlcoholDTO dto4=new AlcoholDTO("Old Monk",880d,true,750d,AlcoholType.RUM);
		AlcoholDTO dto5=new AlcoholDTO("McDowell's No.1",580d,true,750d,AlcoholType.WHISKEY);
		
		List<AlcoholDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		Collections.sort(list);

		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);
			System.out.println(alcohol.getBrand());

		}

	}

}
