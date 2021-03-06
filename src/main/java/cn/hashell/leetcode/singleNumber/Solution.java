package cn.hashell.leetcode.singleNumber;

public class Solution {
    public int singleNumber(int[] A) {
        if(A == null || A.length == 0){
            return -1;
        }
        int result = A[0];
        for(int i=1;i<A.length;i++){
            result = result ^ A[i];
        }
        return result;
    }
}
