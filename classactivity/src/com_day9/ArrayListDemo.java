package com_day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		String[] days= {"MOnday","Tuesday","wednesday","Thursday","Friday","Saturday","sunday"};
		List<Object> shopping_list= new ArrayList<>();
		shopping_list.add("shampoo");
		shopping_list.add("conditioner");
		shopping_list.add("ipad");
		//System.out.println(shopping_list.addAll(days));
		//System.out.println(shopping_list.containsAll);
		System.out.println(Arrays.toString(days));
		
		System.out.println(shopping_list);
		System.out.println(shopping_list.size());
		//shopping_list.remove(0, 56);
		
				}

}
