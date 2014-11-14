package cn.hashell.leetcode.zigZagConversion;

public class Solution {
	 
	public String convert(String s, int nRows) {
		if(s == null || nRows <= 1 || nRows >= s.length()){
			return s;
		}
		StringBuffer buffer = new StringBuffer(s.length());
		for(int i=1;i<=nRows;i++){
			int start = i-1;
			boolean isEven = true;
			while(start<s.length()){
				buffer.append(s.charAt(start));
				if(i ==1 || i == nRows){
					start = start + (nRows-1)*2;
				} else if(isEven){
					start = start + (nRows-i)*2;
					isEven = false;
				} else {
					start  = start + (i-1)*2;
					isEven = true;
				}
			}
		}
		return buffer.toString();
	}
}
