package io.UnitConversion;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Metric Conversion Testing")
class MetricConversionTest {
    Metric_Conversion unit_conv;
    @BeforeEach
    void init()
    {
    	unit_conv=new Metric_Conversion();
    }
	@Nested
	@DisplayName("Km to M Conversion Testing")
	class Km_To_M{
	@Test
	@DisplayName("Km to m Conversion for 0")
	void testCheck_Km_to_M_Confor0() {
		assertEquals(0,unit_conv.km_to_m(0));
	}
	@Test
	@DisplayName("Km to m Conversion for positive")
	void testCheck_Km_to_M_ConforPositive() {
		assertEquals(3000,unit_conv.km_to_m(3));
	}
	@Test
	@DisplayName("Km to m Conversion for Negative")
	void testCheck_Km_to_M_ConforNegative() {
		assertEquals(-5000,unit_conv.km_to_m(-5));
	}
	@Test
	@DisplayName("Km to m Conversion for float")
	void testCheck_Km_to_M_ConforFloat() {
		assertEquals(5000.00,unit_conv.km_to_m(5.00));
	}
	@Test
	@DisplayName("Km to m conversion for String")
	void testcheck_km_to_M_ConforString()
	{
		double val=unit_conv.ParseString("40");
		assertEquals(40000,unit_conv.km_to_m(val));
	}
	}
	@Nested
	@DisplayName("M to Km Conversion Testing")
	class M_To_KM{
	@Test
	@DisplayName("M to Km Conversion for 0")
	void testCheck_M_to_Km_Confor0() {
		assertEquals(0,unit_conv.M_to_Km(0));
	}
	@Test
	@DisplayName("M to Km Conversion for positive")
	void testCheck_M_to_Km_ConforPositive() {
		assertEquals(1.1200,unit_conv.M_to_Km(1120));
	}
	@Test
	@DisplayName("M to Km Conversion for Negative")
	void testCheck_M_to_Km_ConforNegative() {
		assertEquals(-5,unit_conv.M_to_Km(-5000));
	}
	@Test
	@DisplayName("M to Km Conversion for float")
	void testCheck_M_to_Km_ConforFloat() {
		assertEquals(5.0,unit_conv.M_to_Km(5000));
	}
	@Test
	@DisplayName("M to Km conversion for String")
	void testcheck_M_to_Km_ConforString()
	{
		double val=unit_conv.ParseString("40000");
		assertEquals(40,unit_conv.M_to_Km(val));
	}
	}
	@Nested
	@DisplayName("M to Cm Conversion Testing")
	class M_To_Cm{
		@Test
		@DisplayName("M to Cm Conversion for 0")
		void testCheck_M_to_Cm_Confor0() {
			assertEquals(0,unit_conv.M_to_Cm(0));
		}
		@Test
		@DisplayName("M to Cm Conversion for positive")
		void testCheck_M_to_Cm_ConforPositive() {
			assertEquals(300,unit_conv.M_to_Cm(3));
		}
		@Test
		@DisplayName("M to Cm Conversion for Negative")
		void testCheck_M_to_Cm_ConforNegative() {
			assertEquals(-500,unit_conv.M_to_Cm(-5));
		}
		@Test
		@DisplayName("M to Cm Conversion for float")
		void testCheck_M_to_Cm_ConforFloat() {
			assertEquals(8000.0,unit_conv.M_to_Cm(80));
		}
		@Test
		@DisplayName("M to Cm conversion for String")
		void testcheck_km_to_Cm_ConforString()
		{
			double val=unit_conv.ParseString("40000");
			assertEquals(4000000,unit_conv.M_to_Cm(val));
		}
		}
	@Nested
	@DisplayName("Cm to M Conversion Testing")
	class Cm_To_M{
		@Test
		@DisplayName("Cm to M Conversion for 0")
		void testCheck_Cm_to_M_Confor0() {
			assertEquals(0,unit_conv.Cm_to_M(0));
		}
		@Test
		@DisplayName("Cm to M Conversion for positive")
		void testCheck_Cm_to_M_ConforPositive() {
			assertEquals(30,unit_conv.Cm_to_M(3000));
		}
		@Test
		@DisplayName("Cm to M Conversion for Negative")
		void testCheck_Cm_to_M_ConforNegative() {
			assertEquals(-50,unit_conv.Cm_to_M(-5000));
		}
		@Test
		@DisplayName("Cm to M Conversion for float")
		void testCheck_Cm_to_M_ConforFloat() {
			assertEquals(8.00,unit_conv.Cm_to_M(800));
		}
		@Test
		@DisplayName("Cm to M conversion for String")
		void testcheck_Cm_to_M_ConforString()
		{
			double val=unit_conv.ParseString("40000");
			assertEquals(400,unit_conv.Cm_to_M(val));
		}
		}
	
}
