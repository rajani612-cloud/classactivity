package com_day7;

public class StockUnavailable implements Runnable {

   
    
    public void run() {
       for(int i=0;i<10;i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    	for (int j = 0; j < 3; j++) { 
            StockUnavailable ur = new StockUnavailable();
            Thread t = new Thread(ur);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    	}
    } 
}

