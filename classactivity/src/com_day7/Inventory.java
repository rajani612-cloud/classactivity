package com_day7;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Inventory {
	private int stock=100;
	private Lock lock=new ReentrantLock();
	public  synchronized void purchase(String user,int qty) {
		lock.lock();
		try {
		if(stock>=qty) {
			System.out.println(user + "purchased"+ qty+ "item");
			stock-=qty;
			System.out.println("available stocks" + getStock());
		}
		
		else {
			System.out.println("Not purchased");
		}
		}
		finally {
			lock.unlock();
			System.out.println("insert finally");
		}
	}
	public int getStock() {
		return stock;
	}
//	public void purchase(String user) {
//		//lock.lock();
//		try {
//		if(stock >= qty) {
//			System.out.println(user  + "purchased" +qty + "item");
//			stock -= qty;
//			System.out.println(stock);
//		}
//		else {
//			System.out.println("Not purchased!");
//		}
//		}
//		finally {
//			lock.unlock();
//		}
	}

	



