package io.UnitConversion;

public class Metric_Conversion {
	
	public static final double INCH_TO_M_FACTOR=0.0254;
	public static final double KM_TO_M_FACTOR=1000;
	
	public double INCH_TO_M(double value)
	{
		return  INCH_TO_M_FACTOR * value;
	}
	
	public double M_TO_INCH(double value)
	{
		return value/INCH_TO_M_FACTOR;
	}
	
	public double KM_TO_M(double value)
	{
		return  KM_TO_M_FACTOR * value;
	}
	
	public double M_TO_KM(double value)
	{
		return value/KM_TO_M_FACTOR;
	}
	

}
