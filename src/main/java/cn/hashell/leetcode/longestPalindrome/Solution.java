package cn.hashell.leetcode.longestPalindrome;

/**
 * accepted at 2014-11-12
 * @author 梁宗桦
 *
 */
public class Solution {

	public String longestPalindrome(String s) {
        if(s == null || s.length() == 1){
        	return s;
        }
        int length = s.length();
		int longest = 1;
		int start = 0;
		char [] chars = s.toCharArray();
		if(chars[0] == chars[1]){
			longest = 2;
		}
		int current = 2;
		while(current<length){
			if(chars[current] == chars[current-1]){
				int front = current-1;
				int to    = current;
				while(to<length-1 && front>0 && chars[to+1] == chars[front-1]){
					to++;
					front--;
				}
				if(longest < to-front+1){
					start = front;
					longest = to-front+1;
					if(longest == length){
						break;
					}
				}
			}
			if(chars[current] == chars[current-2]){
				int front = current-2;
				int to    = current;
				while(to<length-1 && front>0 && chars[to+1] == chars[front-1]){
					to++;
					front--;
				}
				if(longest < to-front+1){
					start = front;
					longest = to-front+1;
					if(longest == length){
						break;
					}
				}
			} 
			current++;
		}
		return s.substring(start,start+longest);
    }

}
