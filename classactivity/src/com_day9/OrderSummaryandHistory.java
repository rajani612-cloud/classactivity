package com_day9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class OrderSummaryandHistory {
	private ArrayList<String> productList = new ArrayList<>();

	  
	    public void addProduct(String item) {
	        productList.add(item);
	    }

	   
	    public void removeProduct(String item) {
	        if (productList.contains(item)) {
	            productList.remove(item);
	            System.out.println(item + " removed from cart.");
	        } else {
	            System.out.println(item + " not found in cart.");
	        }
	    }

	    
	    public void showCart() {
	        System.out.println("Your Shopping Cart:");
	        if (productList.isEmpty()) {
	            System.out.println("Cart is empty.");
	            return;
	        }

	        
	        LinkedList<String> displayList = new LinkedList<>(productList);
	        for (String item : displayList) {
	            System.out.println(" - " + item);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        OrderSummaryandHistory cart = new OrderSummaryandHistory();

	        System.out.println("Welcome to Blinkit Shopping Cart");

	      
	        System.out.print("How many products would you like to add? ");
	        int count = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter product " + i + ": ");
	            String item = scanner.nextLine();
	            cart.addProduct(item);
	        }

	      
	        cart.showCart();

	        
	        System.out.print("Enter product to remove: ");
	        String removeItem = scanner.nextLine();
	        cart.removeProduct(removeItem);

	       
	        cart.showCart();

	        scanner.close();
	    }
	}



