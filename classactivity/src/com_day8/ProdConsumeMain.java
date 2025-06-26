package com_day8;

public class ProdConsumeMain {
  public static void main(String [] args) {
	  ProducerConsumerProblemdemo prod1= new ProducerConsumerProblemdemo();
	  new ProducerThread(prod1).start();
	  new ConsumerThread(prod1).start();
  }
}
