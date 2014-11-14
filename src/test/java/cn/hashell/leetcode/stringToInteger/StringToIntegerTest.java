package cn.hashell.leetcode.stringToInteger;

import junit.framework.TestCase;

public class StringToIntegerTest extends TestCase{

	Solution solution = new Solution();
	
	public void testAtoi1(){
		String input = "123";
		int expect = 123;
		assertEquals(expect, solution.atoi(input));
	}
	
	public void testAtoi2(){
		String input = "-123";
		int expect = -123;
		assertEquals(expect, solution.atoi(input));
	}
	
	public void testAtoi3(){
		String input = "+123";
		int expect = 123;
		assertEquals(expect, solution.atoi(input));
	}
	
	public void testAtoi4(){
		String input = "   123";
		int expect = 123;
		assertEquals(expect, solution.atoi(input));
	}
	public void testAtoi5(){
		String input = "   -123";
		int expect = -123;
		assertEquals(expect, solution.atoi(input));
	}
	
	public void testAtoi6(){
		String input = "   1 2 3";
		int expect = 1;
		assertEquals(expect, solution.atoi(input));
	}
}
