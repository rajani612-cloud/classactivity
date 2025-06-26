package com_day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String,List<String>>customer= new HashMap<>();
		customer.put("Fashion",Arrays.asList("Preetii","chandu"));
		customer.put("Laptop", Arrays.asList("chityala","naveen","muskan"));
		System.out.println(customer);
		customer.putIfAbsent("Electronics",new ArrayList<>());
		customer.get("Electronics").add("Jaya");
		for(Map.Entry<String, List<String>>entry :customer.entrySet()) {
			System.out.println("category"+ entry);
		}
	    for(Map.Entry<String,List<String>>entry:customer.entrySet()) {
	    	System.out.println("category:"+ entry.getKey());
	    }
		for (Map.Entry<String, List<String>> entry  : customer.entrySet()) {

			System.out.println("Category: " +entry.getKey() + "Customer" + entry.getValue());

		}
	    
	}
	

}
