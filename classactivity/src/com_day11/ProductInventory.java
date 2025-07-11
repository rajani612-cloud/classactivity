package com_day11;
 
import java.util.HashMap;
import java.util.Map;
 
class Product
{
  private String name;
  private double price;
  private int stock;
 
  public Product(String name, double price, int stock) {
	super();
	this.name = name;
	this.price = price;
	this.stock = stock;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
}

}
public class ProductInventory {
	public static void main(String[] args) {
		//Hashmap  with product object
		Map<String,Product> inventory = new HashMap();
		inventory.put("P001", new Product("iphone 16",79999.00,10));
		inventory.put("P002", new Product("Samasung galaxy s24+",70999.00,15));
		inventory.put("P003", new Product("OnePlus",59999.00,20));
		//Retrieve the product using productId
		String serchId = "P002";
		Product searchProduct = inventory.get(serchId);
		if(searchProduct != null) {
			System.out.println("Product Found: " +searchProduct);
		}
		else
		{
			System.out.println("Product not found");
		}
	}
 
}
