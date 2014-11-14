package cn.hashell.leetcode.reverseInteger;


/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Have you thought about this?
 *	Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 *	If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *	Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 *	For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * @author 梁宗桦
 * @date   2014-11-14
 */
public class solution {
	//notity that : Integer.MIN_VALUE=-2147483648 Integer.MAX_VALUE = 2147483647
	public int reverse(int x) {
		if(x == Integer.MIN_VALUE || x == Integer.MAX_VALUE){
			return 0;
		}
        boolean isNegative = false;
		if(x<0){
			isNegative = true;
			x = -x; 
        }
		int tmp = x;
		long result = 0L;
		while(tmp != 0){
			result = result*10 + tmp%10;
			tmp = tmp/10;
		}
		if(isNegative){
			result = -result;
			return (result < Integer.MIN_VALUE?0:(int)result);
		} else {
			return (result > Integer.MAX_VALUE?0:(int)result);
		}
    }
}
