package Multithreading_trainscheduling;

public class RailwaySystem {
	
	private boolean trackoccupied=false;
	
	public synchronized void useTrack(String trainName) {
		//String trainName ;
		while(trackoccupied)
		{
			try
			{
				System.out.println(trainName + "is waiting for the track.");
			    wait();
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		trackoccupied =true;
		System.out.println(trainName + "is ussing the track");
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		trackoccupied=false;
		System.out.println(trainName+ "has cleared the track.");
		notify();
	}
	


}
