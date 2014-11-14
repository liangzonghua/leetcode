package cn.hashell.leetcode.stringToInteger;

/**
 * Implement atoi to convert a string to an integer.
 *	Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *	Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *
 *	Requirements for atoi:
 *  The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 *	The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 *	If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *	If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * @author 梁宗桦
 * @date   2014-11-14
 */
public class Solution {
	/** 0-9 ASCII: 48-57 **/
	public int atoi(String s){
		if(s == null || s.equals("")){
			return 0;
		}
		char[] chars = s.toCharArray();
		long result = 0;
		boolean isNegative = false;
		int carry = -1;
		for(int i=0;i<chars.length;i++){
			if(chars[i] == 32 && carry == -1){ //空格
				continue;
			} else if(chars[i] == 45 && carry == -1){ //-
				carry = 0;
				isNegative = true;
			} else if(chars[i] == 43 && carry == -1){ //+
				carry = 0;
				isNegative = false;
			} else if(chars[i]>=48 && chars[i]<=57){
				if(carry == -1){
					carry = 0;
				}
 				result = (chars[i]-48)  + result*10;
 				if(result >= Integer.MAX_VALUE){
 					break;
 				}
				carry++;
			} else { //other chars
				break;
			}
		}
		if(isNegative){
			result = -result;
			return result<Integer.MIN_VALUE?Integer.MIN_VALUE:(int)result;
		} else {
			return result>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)result;
		}
	}
}
