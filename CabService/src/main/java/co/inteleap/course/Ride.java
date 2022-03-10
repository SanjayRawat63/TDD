package co.inteleap.course;

public class Ride {

	private double Distance;
	private double Time;
	public Ride(double distance,double time)
	{
		this.Distance=distance;
		this.Time=time;
	}
	public double getTime() {
		return Time;
	}
	
	public double getDistance() {
		return Distance;
	}

}
