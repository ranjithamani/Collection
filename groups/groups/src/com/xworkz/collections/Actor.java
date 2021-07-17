package com.xworkz.collections;
import java.util.*;
public class Actor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actor1="Allu Arjun";
		String actor2="Surya";
		String actor3="Devarakonda";
		String actor4="Darshan";
		String actor5="Sudeep";
		String actor6="Karthikeyan";
		String actor7="Ram Charan";
		String actor8="Ganesh";
		String actor9="Vijay";
		String actor10="Shahid";
		
		Collection collection=new ArrayList();
		boolean added=false;
		added=collection.add(actor10);
		added=collection.add(actor2);
		added=collection.add(actor7);
		added=collection.add(actor4);
		added=collection.add(actor5);
		added=collection.add(actor6);
		added=collection.add(actor3);
		added=collection.add(actor8);
		added=collection.add(actor9);
		added=collection.add(actor1);
		System.out.println(added);
		
		int total=collection.size();
		System.out.println("total:"+total);
		
		String check="Surya";
		boolean contain=collection.contains(check);
		System.out.println("contain:"+contain);
		
		boolean removed=collection.remove("Ganesh");
		System.out.println(removed);
		
		Iterator iterator=collection.iterator();
		iterator.hasNext();
		Object obj=iterator.next();
		System.out.println("obj:"+obj);//Shahid
		
		iterator.hasNext();
		Object ref=iterator.next();
		System.out.println("ref:"+ref);//Surya

		
		
		
		



	}

}
