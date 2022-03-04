package io.UnitConversion;

public class Metric_Conversion {
	
	public double ParseString(String str)
	{
		str=str.replaceAll("[a-zA-Z\\s]","");
		return (str==null||str.isEmpty()) ? 0 : Double.parseDouble(str);
	}
	public double km_to_m(double value)
	{
		return (value*1000);
	}
	public double M_to_Km(double value)
	{
		return value/1000;
	}
	public double M_to_Cm(double value)
	{
		return value*100;
	}
	public double Cm_to_M(double value)
	{
		return value/100;
	}
	
	

}
