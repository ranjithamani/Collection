package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.TempleDTO;

public interface TempleDAO {

boolean save(TempleDTO dto);
boolean delete(TempleDTO dto);
int totalItems();
TempleDTO findFirstItem();
TempleDTO findLastItem();
TempleDTO findByName(String name);
TempleDTO findByLocation(String loc);
TempleDTO findByLocationAndName(String name,String location);
Collection<TempleDTO> findAll();
Collection<TempleDTO> findAllTempleByLocationStartsWith(char cha);
Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);
Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no);
String findLocationByName(String name);
Collection<String> findAllLocations();

}
