package cn.hashell.leetcode.palindromeNumber;

import cn.hashell.leetcode.palindromeNumber.Solution;
import junit.framework.TestCase;

public class PalindromeNumber extends TestCase{
	Solution solution = new Solution();
	
	public void testIsPalindrome1(){
		assertEquals(true, solution.isPalindrome(1));
	}
	public void testIsPalindrome2(){
		assertEquals(false, solution.isPalindrome(-1));
	}
	public void testIsPalindrome3(){
		assertEquals(true, solution.isPalindrome(11111));
	}
	public void testIsPalindrome4(){
		assertEquals(false, solution.isPalindrome(1122));
	}
	public void testIsPalindrome5(){
		assertEquals(true, solution.isPalindrome(1223221));
	}
	public void testIsPalindrome6(){
		assertEquals(true, solution.isPalindrome(11222211));
	}
	public void testIsPalindrome7(){
		assertEquals(true, solution.isPalindrome(100001));
	}
	public void testIsPalindrome8(){
		assertEquals(false, solution.isPalindrome(14444));
	}
}
