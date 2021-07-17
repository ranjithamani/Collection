package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempleDTO dto = new TempleDTO(1, "Venkateswra Temple", "Tirupati", 500d, "Tirupati Laddu", 300, true,
				"Venkateswra", true);
		TempleDTO dto1 = new TempleDTO(2, "Chamundeshwari Temple", "Mysore", 200d, "Pongal", 50, true, "Chamundeshwari",
				true);
		TempleDTO dto2 = new TempleDTO(3, "Jagannath Temple", "Puri", 250, "Mahaprasad", 300, true, "Krishna", true);
		TempleDTO dto3 = new TempleDTO(4,"Veeranjaneya Swamy Temple", "Mahalakshmi Layout", 40d, "Rock Sugar", 8, true,"Anjaneya",false);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
        System.out.println("total size:" + dao.totalItems());

		TempleDTO deleteTemple = new TempleDTO(3, "Jagannath Temple", "Puri", 250, "Mahaprasad", 300, true, "Krishna", true);
        dao.delete(deleteTemple);
		System.out.println("total size:" + dao.totalItems());
		
		dao.findFirstItem();
		dao.findLastItem();
		
		TempleDTO tm = dao.findByName("Venkateswra Temple");
		System.out.println("find by name:" + tm);
		
		TempleDTO temploc = dao.findByLocation("Mysore");
		System.out.println("find by location:" + temploc);
		
		TempleDTO NL = dao.findByLocationAndName("Veeranjaneya Swamy Temple", "Mahalakshmi Layout");
		System.out.println("Find temple by name and location:" + NL);
		
		dao.findAll();
		//dao.findAllTempleByLocationStartsWith('T');
		dao.findAllTempleByEntryFeeGreaterThan(10d);
		dao.findAllTempleByNoOfPoojarisGreaterThan(50);
		dao.findLocationByName("Chamundeshwari Temple");
		dao.findAllLocations();
	}

}
