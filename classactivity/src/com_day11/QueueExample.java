package com_day11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<>();
		queue.offer("Rajani");
		queue.offer("Nisha");
		queue.offer("Chandu");
		System.out.println("Queue "+queue  );
		System.out.println("Queue peek "+queue.peek());
		System.out.println("Queue remove"+ queue.poll());
		
	}

}
