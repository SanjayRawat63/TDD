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
		double converted_value=metric_conversion.INCH_TO_M(100.0);
		assertEquals(2.54,converted_value);
	}
	@Test
	public void ShouldConvertMToINCH()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		double converted_value=metric_conversion.M_TO_INCH(0.0254);
		assertEquals(1,converted_value);
	}
	
	@Test
	public void ShouldConvertKMToM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		double converted_value=metric_conversion.KM_TO_M(1);
		assertEquals(1000,converted_value);
	}
	@Test
	public void ShouldConvertMToKM()
	{
		Metric_Conversion metric_conversion= new Metric_Conversion();
		double converted_value=metric_conversion.M_TO_KM(1000);
		assertEquals(1,converted_value);
	}
}
