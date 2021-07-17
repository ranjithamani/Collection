package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.RiverDTO;

public interface RiverDAO {

	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

}
