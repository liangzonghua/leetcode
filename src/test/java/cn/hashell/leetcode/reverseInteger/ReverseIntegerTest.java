package cn.hashell.leetcode.reverseInteger;

import junit.framework.TestCase;


public class ReverseIntegerTest extends TestCase{

	solution solution = new solution();
	
	public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }
    
    public void testReverse1() {
    	int input = 123;
    	int expect= 321;
    	assertEquals(expect, solution.reverse(input));
    }
    
    public void testReverse2(){
    	int input = -123;
    	int expect= -321;
    	assertEquals(expect, solution.reverse(input));
    }
    
    public void testReverse3(){
    	int input = 1000000003 ;
    	int expect= 0;
    	assertEquals(expect, solution.reverse(input));
    }
    
    public void testReverse4(){
    	int input = -1000000003 ;
    	int expect= 0;
    	assertEquals(expect, solution.reverse(input));
    }
    
    public void testReverse5(){
    	int input = -1000000000 ;
    	int expect= -1;
    	assertEquals(expect, solution.reverse(input));
    }
    
    public void testReverse6(){
    	int input = 1000000000 ;
    	int expect= 1;
    	assertEquals(expect, solution.reverse(input));
    }
    public void testReverse7(){
    	int input = -2147483648 ;
    	int expect= 0;
    	assertEquals(expect, solution.reverse(input));
    }
    
}
