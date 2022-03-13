package io.UnitConversion;

public class UnitConverter {
	public  String FROM_UNIT;
	public  String TO_UNIT;
	public  double value;
	 static double INCHES_TO_M_FACTOR = 0.0254;
	 static double MILLIMETERS_TO_M_FACTOR = 0.001;
	 static double CENTIMETERS_TO_M_FACTOR = 0.01;
	 static double METERS_TO_M_FACTOR = 1;
	 static double KILOMETERS_TO_M_FACTOR =1000;
	 private static double CONVERSION_FACTOR;
	 
	 public UnitConverter(String from, String to, double value)
		{
			this.FROM_UNIT=from;
			this.TO_UNIT=to;
			this.value=value;
		}
	 
	 public  double Conversion_Factor(String unit)
		 {
			 if(unit.equals("in"))
			  {
			   CONVERSION_FACTOR=INCHES_TO_M_FACTOR;
			  }
			  else if(unit.equals("mm"))
			  {
			   CONVERSION_FACTOR = MILLIMETERS_TO_M_FACTOR;
			  }
			  else if(unit.equals("cm"))
			  {
			   CONVERSION_FACTOR =  CENTIMETERS_TO_M_FACTOR;
			  }
			  else if(unit.equals("m"))
			  {
			   CONVERSION_FACTOR = METERS_TO_M_FACTOR;
			  }
			  else if(unit.equals("km"))
			  {
			  CONVERSION_FACTOR = KILOMETERS_TO_M_FACTOR;
			  }
			 return CONVERSION_FACTOR;
		 }
	 
	 public double converter()
	 {
		 double converted_to_meter=GivenUnitToMeters(value);
		 double converted_value=MeterToGivenConversionUnit(converted_to_meter);
		 return converted_value;
	 }
	 
	 public double GivenUnitToMeters(double value) 
	 {
		double converter_factor=Conversion_Factor(FROM_UNIT);
	    return value*converter_factor;
	 }
	 
	 public double MeterToGivenConversionUnit(double meters) 
	 {
		 double converter_factor=Conversion_Factor(TO_UNIT);
		 return meters/converter_factor;
	 }	
	}
	


