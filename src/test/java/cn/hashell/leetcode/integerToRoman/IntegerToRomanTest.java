package cn.hashell.leetcode.integerToRoman;

import junit.framework.TestCase;

public class IntegerToRomanTest extends TestCase{

	Solution solution = new Solution();
	
	public void test1(){
		assertEquals("I", solution.intToRoman(1));
	}
	
	public void test99(){
		assertEquals("XCIX", solution.intToRoman(99));
	}
}
