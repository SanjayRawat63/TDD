package io.swapchars;

public class SwapChars {
	public String SwapLastTwoChars(String str)
	{
		int len=str.length();
		if(len<2)
			return str;
		String StrMinusLastTwo=str.substring(0,len-2);
		char LastChar=str.charAt(len-1);
		char SecondLastChar=str.charAt(len-2);
		return StrMinusLastTwo + LastChar + SecondLastChar;
	}

}
