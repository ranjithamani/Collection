package com.xworkz.datastore.dao;

import java.util.*;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {

	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto:" + dto);
		System.out.println("dto was added:" + added);
		return false;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("dto found and removed:" + dto);
			return this.list.remove(dto);
		}
		System.out.println("temple not removed");
		return false;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		// System.out.println("total items:"+total);
		return total;
	}

	@Override
	public TempleDTO findFirstItem() {
		TempleDTO firstItem = list.get(0);
		System.out.println("firstItem:" + firstItem);

		return firstItem;
	}

	@Override
	public TempleDTO findLastItem() {
		TempleDTO lastItem = list.get(list.size() - 1);
		// System.out.println("lastItem:" + lastItem);
		return lastItem;
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> iterator = this.list.iterator();
		while (iterator.hasNext()) {
			TempleDTO temple = iterator.next();
			if (temple.getName().equals(name)) {
				dto = temple;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dt = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO tem = itr.next();
			if (tem.getLocation().equals(loc)) {
				dt = tem;
				break;
			}
		}
		return dt;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO templ = null;
		Iterator<TempleDTO> iterator = this.list.iterator();
		while (iterator.hasNext()) {
			TempleDTO tem = iterator.next();
			if (tem.getName().equals(name) && tem.getLocation().equals(location)) {
				templ = tem;
				System.out.println("find location and name:"+tem);
				break;
			}
		}
		return templ; 
	}

	@Override
	public Collection<TempleDTO> findAll() {

		return this.list;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char cha) {
		char c = cha;
		String string = Character.toString(c);
		Collection<TempleDTO> col = new ArrayList<>();

		Iterator<TempleDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			TempleDTO temp = iterator.next();
			if (temp.getLocation().startsWith(string)) {
            col.add(temp);
				 System.out.println("Temple name by location starts with T:"+temp);
			}
		}
		return col;

	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Collection<TempleDTO> coll = new ArrayList<>();

		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO value = itr.next();
			if (value.getEntryFee() > cost) {
				coll.add(value);
				 System.out.println("Temple has more entry Fee:" + value);
			}
		}
		return coll;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no) {
		Collection<TempleDTO> collection = new ArrayList<>();

		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO temple = itr.next();
			if (temple.getNoOfPoojaris() > no) {
				collection.add(temple);
				
				System.out.println("Temples having more Poojaries:" + temple);
			}
		}
		return collection;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		String temp=null;
		while (itr.hasNext()) {
			TempleDTO tr = itr.next();
			if (tr.getName().equals(name)) {
				System.out.println("find location By Name:" + tr);
                temp=tr.getLocation();
			}
		}
		return temp;
	}

	@Override
	public Collection<String> findAllLocations() {
		Collection<String> collect = new ArrayList<>();

		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO loc = itr.next();
			collect.add(loc.getLocation());
			System.out.println("find All Locations:" + loc.getLocation());
		}

		return collect;
	}
}
