package com_day9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
   public static void main(String[] args) {
	List<String>call_history=new LinkedList<>();
	call_history.add("Nisha");
	call_history.add("Ramya");
	call_history.add("vilal");
	call_history.add("Pranali");
	call_history.add("Chandu");
	System.out.println(call_history);
	System.out.println("tolat size"+call_history.size());
	
	
	System.out.println("search   "+call_history.contains("Nisha"));
	call_history.set(3, "hsdgd");
	System.out.println(call_history);
}
}
