package com_day8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
  
	public static void main(String[] args) {
		
	
	BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(5);
	
	Runnable producer=() -> {
		int value=0;
		try {
			while(true)
			{
				queue.put(value);
				System.out.println("Produce"+value);
				value++;
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		};
		
		Runnable consumer=() -> {
			
			try {
				while(true)
				{
					
					int value=queue.take();
					System.out.println("Consume"+value);
					Thread.sleep(1000);
					
				}
			}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			};
			new Thread(producer).start();
			new Thread(consumer).start();
	}
}
	
	

