package Multithreading_trainscheduling;

public class Main {
	public static void main(String []args)
	{
		RailwaySystem railsys=new RailwaySystem();
		
		new Train(railsys, "RajdhaniExpress").start();
		new Train(railsys,"Tejas").start();
		new Train(railsys, "ShatabdiExpress").start();
		
	}


}
