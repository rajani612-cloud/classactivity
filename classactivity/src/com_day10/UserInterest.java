package com_day10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UserInterest {
public static void main(String[] args) {
	Set<String>interest=new TreeSet();
	interest.add("reading");
	interest.add("cooking");
	
	Set<Integer>  set = new HashSet();
	set.add(100);
	set.add(10);
	set.add(200);
	set.add(30);
	set.add(189);
	System.out.println(set);
	System.out.println(interest);
	
}
}
