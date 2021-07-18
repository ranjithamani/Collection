package com.xworkz.datastore.tester;

import java.util.Collection;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOImpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		TempleDTO dto = new TempleDTO(1, "Venkateswra Temple", "Tirupati", 500d, "Tirupati Laddu", 50, true,
				"Venkateswra", true);
		TempleDTO dto1 = new TempleDTO(2, "Chamundeshwari Temple", "Mysore", 200d, "Pongal", 25, true, "Chamundeshwari",
				true);
		TempleDTO dto2 = new TempleDTO(3, "Jagannath Temple", "Puri", 250, "Mahaprasad", 300, true, "Krishna", true);
		TempleDTO dto3 = new TempleDTO(4, "Veeranjaneya Swamy Temple", "Mahalakshmi Layout", 40d, "Rock Sugar", 8, true,
				"Anjaneya", false);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		System.out.println("total size:" + dao.totalItems());

		TempleDTO deleteTemple = new TempleDTO(3, "Jagannath Temple", "Puri", 250, "Mahaprasad", 300, true, "Krishna",
				true);
		dao.delete(deleteTemple);
		System.out.println("total size:" + dao.totalItems());

		TempleDTO first = dao.findFirstItem();
		System.out.println("Find FirstItem:" + first);

		TempleDTO temp1 = dao.findLastItem();
		System.out.println("findLastItem:" + temp1);

		TempleDTO tm = dao.findByName("Venkateswra Temple");
		System.out.println("find by name:" + tm);

		TempleDTO temploc = dao.findByLocation("Mysore");
		System.out.println("find by location:" + temploc);

		TempleDTO NL = dao.findByLocationAndName("Veeranjaneya Swamy Temple", "Mahalakshmi Layout");
		System.out.println("Find temple by name and location:" + NL);

		Collection<TempleDTO> findall = dao.findAll();
		for (TempleDTO templeDTO : findall) {
			System.out.println("find all:"+templeDTO);

		}
		Collection<TempleDTO> temple = dao.findAllTempleByLocationStartsWith('T');
		for (TempleDTO templeDTO : temple) {
			System.out.println("location starts with:"+templeDTO);

		}
		Collection<TempleDTO> collection = dao.findAllTempleByEntryFeeGreaterThan(10d);
		for (TempleDTO templeDTO : collection) {
			 System.out.println("fee greater:"+templeDTO);

		}
		Collection<TempleDTO> collect = dao.findAllTempleByNoOfPoojarisGreaterThan(5);
		for (TempleDTO templeDTO : collect) {
			System.out.println(" more poojaries:"+templeDTO);

		}
		String string = dao.findLocationByName("Chamundeshwari Temple");
		System.out.println(" location by name:"+string);

		Collection<String> temp = dao.findAllLocations();
		for (String string2 : temp) {
			System.out.println(" find all location:"+string2);

		}
	}


	}


