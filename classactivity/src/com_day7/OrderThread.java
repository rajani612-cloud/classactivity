package com_day7;

public class OrderThread extends Thread {
    Inventory inventory;
   String user;
   int qty;
   public OrderThread(Inventory inventory, String user, int qty) {
	   super();
	   this.inventory=inventory;
	   this.user=user;
	   this.qty=qty;
	   
   }
   public void run()
   {
	   inventory.purchase(user,qty);
   }
   public static void main(String [] args)
   {
	   Inventory inv=new Inventory();
	   OrderThread th1=new OrderThread(inv,"Rajani",50);
	   OrderThread th2=new OrderThread(inv,"Rajani",89);
	   OrderThread th3=new OrderThread(inv,"Rajani",60);
	   th1.start();
	   th2.start();
	   th3.start();
   }
}
