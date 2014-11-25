package cn.hashell.leetcode.integerToRoman;

public class Solution {
	String [] revRomanFlags=new String[]{
			"I","II","III","IV","V","VI","VII","VIII","IX",
			"X","XX","XXX","XL","L","LX","LXX","LXXX","XC",
			"C","CC","CCC","CD","D","DC","DCC","DCCC","CM",
			"M","MM","MMM"};
	
	public String intToRoman(int num) {
		if(num<1 || num>3999){
			return "";
		}
		StringBuffer stringBuffer = new StringBuffer();
		int carry = 1000;
		while(carry>0){
			int x = num/carry;
			if(x!=0){
				stringBuffer.append(revRomanFlags[(int)Math.log10(carry)*9+x-1]);
			} 
			num = num%carry;
			carry = carry/10;
		}
		return stringBuffer.toString();
    }
	
}
