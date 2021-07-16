package com.xworkz.collections.dto;

import com.xworkz.collections.dto.constants.*;
import java.util.*;

public class OilTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OilDTO dto = new OilDTO("Bazaz", 170d, OilType.ALMOND, OilColor.GOLD, true, false, true, 55d);
		OilDTO dto1 = new OilDTO("Parachute", 200d, OilType.COCONUT, OilColor.LIGHTYELLOW, true, false, true, 45d);
		OilDTO dto2 = new OilDTO("FREEDOM", 180d, OilType.SUNFLOWER, OilColor.GOLD, true, true, true, 55d);

		Collection<OilDTO> collection = new ArrayList<OilDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		Iterator<OilDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			OilDTO ref = iterator.next();
			System.out.println(ref);
			if (ref.getPrice() != null && ref.getPrice() > 100) {
				System.out.println("oil price is high");

			}
		}
		OilDTO temp = new OilDTO("freedom", 180d, OilType.SUNFLOWER, OilColor.GOLD, true, true, true, 55d);

		boolean contain = collection.contains(temp);
		System.out.println(contain);

	}

}
