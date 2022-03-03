package io.plaindromechecker;

public class PlaindromeChecker {
         public boolean isPlaindrome(String str)
         {
        	 str=str.replaceAll("\\s","").toLowerCase();
        	 StringBuilder s=new StringBuilder(str);
        	 String reverse=s.reverse().toString();
        	 return reverse.equals(str);
         }
}
