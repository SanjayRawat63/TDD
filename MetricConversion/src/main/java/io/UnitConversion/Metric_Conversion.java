package io.UnitConversion;

public class Metric_Conversion {
	
	public static final double INCH_TO_M_FACTOR=0.0254;
	public static final double KM_TO_M_FACTOR=1000;
	
	public double Unit_Converter(UnitConverter conv)
	{
	    String from_unit=conv.getFromUnit();
	    String to_unit=conv.getToUnit();
	    double value_to_be_converted= conv.getValue();
	    if(from_unit.equals("in")&&to_unit.equals("m"))
		   return INCH_TO_M(value_to_be_converted);
	    else if(from_unit.equals("m")&&to_unit.equals("in"))
			   return M_TO_INCH(value_to_be_converted);
	    if(from_unit.equals("km")&&to_unit.equals("m"))
			   return KM_TO_M(value_to_be_converted);
	    else	
	       return M_TO_KM(value_to_be_converted);
	 
	}
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
