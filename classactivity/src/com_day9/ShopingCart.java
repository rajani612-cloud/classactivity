package com_day9;

import java.util.ArrayList;
import java.util.Scanner;


public class ShopingCart {
	ArrayList<String> product = new ArrayList<>();
	public void addProduct(String item) {
		product.add(item);
	}
	public void removeProduct(String item) {
		product.remove(item);
	}
	 public void showCart() {
		 for(String  cartItem: product ) {
			 System.out.println(cartItem);
		 }
	 }
 
	 public static void main(String[] args) {
		 Scanner ob=new Scanner(System.in);
		 System.out.println("Enter the product you want to purchase");
		
		 
		 ShopingCart cart = new ShopingCart();
		 
		 cart.addProduct("Laptop");
		 cart.addProduct("keyboard");
		 cart.addProduct("mouse");
		 cart.addProduct("Printer");
		 cart.addProduct("Scanner");
		 cart.addProduct("usb");
		 cart.addProduct("music system");
		 cart.showCart();
		 cart.removeProduct("mouse");
		 cart.showCart();
	}
}

