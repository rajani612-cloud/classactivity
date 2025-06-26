package com_day8;

import java.util.LinkedList;

public class ProducerConsumerProblemdemo {
 private static final int capacity=2;
 private final LinkedList<Integer>buffer= new LinkedList();
  
  synchronized public void produce(int value) throws InterruptedException {
	 while(buffer.size()==capacity) {
	wait();	 
	 }
	 buffer.add(value);
	 System.out.println("produce" +value);
	 notify();
 }

public void consume() throws InterruptedException
{
	while(buffer.isEmpty()) {
		System.out.println("enter wait state in consumer");
		wait();
		
		Thread.interrupted();
	}
	int value= buffer.removeFirst();
	System.out.println("Product consumed "+ value);
	//Thread.sleep(1000);
	
}
}

