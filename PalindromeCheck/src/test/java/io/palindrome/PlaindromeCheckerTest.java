package io.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.plaindromechecker.PlaindromeChecker;
@DisplayName("Plaindrome checker test running")
class PlaindromeCheckerTest {
    PlaindromeChecker pc;
    @BeforeEach
    void init()
    {
    	pc=new PlaindromeChecker();
    }
	@Test
	@DisplayName("checking for one word in string")
	void testisPlaindrome() {
		assertTrue(pc.isPlaindrome("mom"),()->"String is not a plaindrome");
	}
	@Test 
	@DisplayName("checking for one word in string")
	void testisPlaindrome1()
	{
		assertFalse(pc.isPlaindrome("sanjay"),()->"String is a plaindrome");
	}
	@Test 
	@DisplayName("checking for case sensitive  word in string")
	void testisPlaindrome2()
	{
		assertTrue(pc.isPlaindrome("Mom"),()->"String is not a plaindrome.");
	}
	@Test 
	@DisplayName("checking for more than one word with case senstive in string")
	void testisPlaindrome3()
	{
		assertTrue(pc.isPlaindrome("Was It A Rat I Saw"),()->"String is not a plaindrome.");
	}

}
