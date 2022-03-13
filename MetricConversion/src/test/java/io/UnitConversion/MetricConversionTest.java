package io.UnitConversion;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Metric Conversion Testing")
class MetricConversionTest {
   
	@Test
	public void ShouldConvertINCHToM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("in","m",2);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(0.0508,converted_value);
	}
	
	@Test
	public void ShouldConvertMToINCH()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("m","in",0.0254);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(1,converted_value);
	}
	
	@Test
	public void ShouldConvertKMToM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("km","m",1);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(1000,converted_value);
	}
	
	@Test
	public void ShouldConvertMToKM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("m","km",1000);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(1,converted_value);
	}
	
	@Test
	public void ShouldConvertMToCM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("m","cm",1);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(100,converted_value);
	}
	
	@Test
	public void ShouldConvertCMToM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("cm","m",100);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(1,converted_value);
	}
	
	@Test
	public void ShouldConvertINCHToKM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("in","km",10);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(0.000254,converted_value);
	}
	
	@Test
	public void ShouldConvertKMToINCH()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		UnitConverter unitconverter=new UnitConverter("km","in",0.000254);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(10,converted_value);
	}
}
