package com.xworkz.datastore.tester;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dao.RiverDAOImpl;
import com.xworkz.datastore.dto.RiverDTO;

public class RiverTester {

	public static void main(String[] args) {
		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 505d, true, 3);
		RiverDTO dt1 = new RiverDTO("Krishna", "Mahabaleshwar", 1288, true, 4);

		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dt1);
		System.out.println("total size:" + dao.totalItems());

		RiverDTO updateKaveri = new RiverDTO("Kaveri", "Talakaveri", 505d, false, 3);
		dao.update(updateKaveri);
		System.out.println("total size:" + dao.totalItems());

		dao.delete(dto);
		System.out.println("total size:" + dao.totalItems());

	}

}
