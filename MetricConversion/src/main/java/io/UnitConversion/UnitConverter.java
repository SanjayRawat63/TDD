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
	 private double meters ,converted;
	 
	 public UnitConverter(String from, String to, double value)
		{
			this.FROM_UNIT=from;
			this.TO_UNIT=to;
			this.value=value;
		}	
	 public double converter()
	 {
		 double converted_to_meter=GivenUnitToMeters(value);
		 double converted_value=MeterToGivenConversionUnit(converted_to_meter);
		 return converted_value;
	 }
	 public double GivenUnitToMeters(double val) 
	 {
	  if(FROM_UNIT.equals("in"))
	  {
	   meters = (val*INCHES_TO_M_FACTOR);
	  }
	  else if(FROM_UNIT.equals("mm"))
	  {
	   meters = (val*MILLIMETERS_TO_M_FACTOR);
	  }
	  else if(FROM_UNIT.equals("cm"))
	  {
	   meters = (val * CENTIMETERS_TO_M_FACTOR);
	  }
	  else if(FROM_UNIT.equals("m"))
	  {
	   meters = (val* METERS_TO_M_FACTOR);
	  }
	  else if(FROM_UNIT.equals("km"))
	  {
	   meters = (val*KILOMETERS_TO_M_FACTOR);
	  }
	  return meters;
	 }
	 
	 public double MeterToGivenConversionUnit(double meters) 
	 {
	  if(TO_UNIT.equals("in"))
	  {
	   converted = (meters/INCHES_TO_M_FACTOR);
	  }
	  else if(TO_UNIT.equals("mm")) 
	  {
	   converted = (meters/MILLIMETERS_TO_M_FACTOR);
	  }
	  else if(TO_UNIT.equals("cm")) 
	  {
	   converted = (meters/CENTIMETERS_TO_M_FACTOR);
	  }
	  else if(TO_UNIT.equals("m")) 
	  {
	   converted =(meters/METERS_TO_M_FACTOR);
	  }
	  else if(TO_UNIT.equals("km")) 
	  {
	   converted = (meters/KILOMETERS_TO_M_FACTOR);
	  }
	  return converted;
	 }	
	}
	


