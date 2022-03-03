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
    @DisplayName("Checking for empty String")
    void ShouldCheckforEmpty()
    {
    	assertTrue(pc.isPlaindrome(""));
    }
    @Test
    @DisplayName("If one character and is in LowerCase")
    void ShouldCheckForOneCharLowerCase()
    {
    	assertTrue(pc.isPlaindrome("a"));
    }
    @Test
    @DisplayName("If one character and is in UpperCase")
    void ShouldCheckForOneCharUpperCase()
    {
    	assertTrue(pc.isPlaindrome("A"));
    }
	@Test
	@DisplayName("checking for two character is in string")
	void ShouldCheckforTwoChar() {
		assertFalse(pc.isPlaindrome("mo"));
	}
	@Test 
	@DisplayName("checking for Sanjay is not a palindrome")
	void ShouldCheckForSanjay()
	{
		assertFalse(pc.isPlaindrome("sanjay"));
	}
	@Test
	@DisplayName("mom is plaindrome")
	    void ShouldCheckFormom()
	    {
	    	assertTrue(pc.isPlaindrome("mom"));
	    }
	@Test 
	@DisplayName("checking for case sensitive  word in string")
	void ShouldCheckforCaseSensitiveWord()
	{
		assertTrue(pc.isPlaindrome("Mom"));
	}
	@Test 
	@DisplayName("checking for having whitespaces in string")
	void ShouldCheckForStringWithSpace()
	{
		assertTrue(pc.isPlaindrome("Was It A Rat I Saw"));
	}

}
