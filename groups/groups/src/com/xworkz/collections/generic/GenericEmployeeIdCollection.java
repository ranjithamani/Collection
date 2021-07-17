package com.xworkz.collections.generic;
import java.util.*;
public class GenericEmployeeIdCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String EmpId1="AMS123";
 String EmpId2="AMS456";
 String EmpId3="AMS789";
 String EmpId4="AMS199";
 String EmpId5="AMS333";
 
Collection<String> collection=new ArrayList<String>();
collection.add(EmpId1);
collection.add(EmpId2);
collection.add(EmpId3);
collection.add(EmpId4);
collection.add(EmpId5);

Iterator<String> iterator=collection.iterator();
while(iterator.hasNext()) {
	
	String temp=iterator.next();
	System.out.println(temp);
}

	}

}
