package cn.hashell.leetcode.palindromeNumber;


public class Solution {

	public boolean isPalindrome(int x) {
        if(x<0){
        	return false;
        }
        char[] data = String.valueOf(x).toCharArray();
        int length = data.length;
        for(int i=0;;i++){
        	int j = length-1-i;
        	if(i>=j){
        		break;
        	}
        	if(data[i] != data[j]){
        		return false;
        	} else {
        		continue;
        	}
        }
        return true;
    }

}
