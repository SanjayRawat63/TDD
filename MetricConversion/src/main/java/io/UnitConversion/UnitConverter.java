package io.UnitConversion;

public class UnitConverter {
	public  String FROM_UNIT;
	public  String TO_UNIT;
	public  double value;
	public UnitConverter(String from, String to, double value)
	{
		this.FROM_UNIT=from;
		this.TO_UNIT=to;
		this.value=value;
	}
	
	public String getFromUnit()
	{
		return FROM_UNIT;
	}
	
	public String getToUnit()
	{
		return TO_UNIT;
	}
	
	public double getValue()
	{
		return value;
	}
	

}
