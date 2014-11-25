package cn.hashell.leetcode.romanToInteger;

import java.util.HashMap;

public class Solution {
	public static HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>(7);
	static{
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	}
	
	public int romanToInt(String s) {
		if(s == null || s.equals("")){
			return 0;
		}
		
		char[] data = s.toCharArray();
		int length = data.length;
		int result = 0;
		int i=0;
		while(true){
			char c = data[i];
			int now = romanMap.get(c);
			if(i == length-1){
				result += now;
			} else {
				int next = romanMap.get(data[i+1]);
				if(next>now){
					result -=now;
					result +=next;
					i++;
				} else {
					result +=now;
				}	
			}
			i++;
			if(i==length){
				break;
			}
		}
		return result;
    }
}
