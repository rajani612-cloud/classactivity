package com_day9;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

	
        String [] name=new String[5];
		List<String> productSlots1=new ArrayList<String>();
		public void storeProduct(int slot, String product) {
			productSlots1.add(slot,product);
			name[1]="neha";
			name[2]="rajani";
			name[3]="nisha";
		}
		public String getProduct(int slot) {
			return productSlots1.get(slot);
			
			 
		}
		public static void main(String [] args)
		{
			Warehouse warehouse= new Warehouse();
			warehouse.storeProduct(0,"shampoo");
			warehouse.storeProduct(2, "gift");
			System.out.println(warehouse.getProduct(0));
			
			
		}
	
}
