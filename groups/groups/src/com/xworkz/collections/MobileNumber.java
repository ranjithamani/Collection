package com.xworkz.collections;
import java.util.*;
public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long mobileNo1=9900884455l;
long mobileNo2=8073721260l;
long mobileNo3=9901351673l;
long mobileNo4=9663329184l;
long mobileNo5=7899295776l;
long mobileNo6=9966332244l;
long mobileNo7=7788995544l;
long mobileNo8=8866775544l;
long mobileNo9=8197243812l;
long mobileNo10=7845637921l;

Collection collection=new ArrayList();
boolean added=false;
added=collection.add(mobileNo8);
added=collection.add(mobileNo3);
added=collection.add(mobileNo2);
added=collection.add(mobileNo4);
added=collection.add(mobileNo5);
added=collection.add(mobileNo6);
added=collection.add(mobileNo7);
added=collection.add(mobileNo1);
added=collection.add(mobileNo9);
added=collection.add(mobileNo10);
System.out.println(added);

int total=collection.size();
System.out.println("total:"+total);
//collection.clear();

long check=8073721260l;
boolean contain=collection.contains(check);
System.out.println("contain:"+contain);

boolean removed=collection.remove(9663329184l);
System.out.println(removed);

Iterator iterator=collection.iterator();
iterator.hasNext();
Object obj=iterator.next();
System.out.println("obj:"+obj);//8866775544l

iterator.hasNext();
Object ref=iterator.next();
System.out.println("ref:"+ref);//9901351673l


	}

}
