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
		UnitConverter unitconverter=new UnitConverter("in","m",1);
		double converted_value=metric_conversion.Unit_Converter(unitconverter);
		assertEquals(0.0254,converted_value);
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
}
