package co.inteleap.course;

public class StatementGenerator {
	public static final int FAIR_PER_KM=10;
	public static final int FAIR_PER_MINUTE=1;
	
	public double TotalFare(double Distance,double Time)
	{
		return FAIR_PER_KM * Distance + FAIR_PER_MINUTE * Time;
	}

}
