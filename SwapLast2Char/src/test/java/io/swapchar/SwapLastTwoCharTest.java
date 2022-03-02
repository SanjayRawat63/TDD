package io.swapchar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.swapchars.SwapChars;
@DisplayName("SwapLastTwoChars tests Running")
class SwapLastTwoCharTest {
    SwapChars swap;
	@BeforeEach
	void init()
	{
		swap=new SwapChars();
	}
	@Test
	@DisplayName("if string has only two character")
	void testSwapfor2Chars() {
		assertEquals("BA",swap.SwapLastTwoChars("AB"));
	}
	@Test
	@DisplayName("If string has only one char and less than one char")
	void testSwapfor1char()
	{
		assertEquals("A",swap.SwapLastTwoChars("A"));
	}
	@Test
	@DisplayName("If string four character")
	void testSwapfor4Char()
	{
		assertEquals("ABDC",swap.SwapLastTwoChars("ABCD"));
	}
	@Test
	@DisplayName("If string more than character")
	void testSwapforMoreChar()
	{
		
		assertEquals("SanjayRawta",swap.SwapLastTwoChars("SanjayRawat"));
	}
	@Test
	@DisplayName("If string is null")
	void testfornullstring() 
	{
			assertEquals("",swap.SwapLastTwoChars(""));
	}

}
