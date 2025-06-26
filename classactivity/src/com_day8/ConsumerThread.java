package com_day8;

public class ConsumerThread extends Thread {
   
	  private ProducerConsumerProblemdemo pc;
	     
	     
	      public ConsumerThread(ProducerConsumerProblemdemo pc) {
			super();
			this.pc = pc;
		}
	     public void run() {
	    	 try {
	    		 while(true) {
	    		 pc.consume();
	    		 Thread.sleep(1000);
	    	 }
	     }
	    	 catch(InterruptedException e)
	    	 {
	    		e.printStackTrace(); 
	    	 }
	     }
}
