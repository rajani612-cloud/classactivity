package com_day10;

import java.util.HashSet;
import java.util.Set;

public class ContactSyncApp {
 public static void main(String[] args) {
	String [] simCounts= {"shriivas", "sarvan","jeevan"};
	String [] googleContacts= {"Nisha","pranali","chandu"};
    String [] phoneContact= {"chitti","mohan"};
    Set<String>unique=new HashSet();
    
    for(String contact:simCounts)
    {
    	unique.add(contact);
    }
    for(String contact:googleContacts)
    {
    	unique.add(contact);
    }
    System.out.println("All Contact List");
    
 }
 
}
