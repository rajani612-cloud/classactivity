package Multithreading_trainscheduling;

public class Train extends Thread {
 private final RailwaySystem railsys;
 private final String trainName;
 
 public Train(RailwaySystem railsys, String trainName)
 {
	 this.railsys=railsys;
	 this.trainName=trainName;
 }
 @Override
 public void run() {
	 railsys.useTrack(trainName);
 }
 
 
}
