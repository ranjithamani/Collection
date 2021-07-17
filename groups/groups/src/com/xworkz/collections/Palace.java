package com.xworkz.collections;
import java.util.*;

public class Palace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palace1="Mysore Palace";
String palace2="Bangalore Palace";
String palace3="Lalitha Mahal";
String palace4="Lotus Mahal";
String palace5="Amba Vilas Palace";
String palace6="City Palace";
String palace7="Laxmi Vilas Palace";
String palace8="Rajith  Vilas";
String palace9="Raaj Mahal Palace";
String palace10="Gwalior Palace";

Collection collection =new ArrayList();
boolean added=false;
added=collection.add(palace7);
added=collection.add(palace9);
added=collection.add(palace3);
added=collection.add(palace4);
added=collection.add(palace5);
added=collection.add(palace6);
added=collection.add(palace1);
added=collection.add(palace8);
added=collection.add(palace2);
added=collection.add(palace10);
System.out.println("added:"+added);

int total =collection.size();
System.out.println("total:"+total);

//collection.clear();

String check="Gwalior Palace";
boolean contain=collection.contains(check);
System.out.println("contain:"+contain);

boolean removed=collection.remove("Lotus Mahal");
System.out.println("removed:"+removed);

Iterator iterator=collection.iterator();
iterator.hasNext();
Object ref=iterator.next();
System.out.println("ref:"+ref);//Laxmi 
 
System.out.println(iterator.hasNext());

iterator.hasNext();
iterator.hasNext();
Object temp=iterator.next();
System.out.println("temp:"+temp);//Raaj 
 
iterator.hasNext();
iterator.hasNext();
iterator.hasNext();

Object obj=iterator.next();
System.out.println("obj:"+obj);//Lalitha Mahal
 




	}

}
