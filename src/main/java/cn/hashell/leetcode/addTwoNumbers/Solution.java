package cn.hashell.leetcode.addTwoNumbers;

/**
 * accepted 2014/11/8
 * @author 梁宗桦
 * 
 */
public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(0);
        
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode sumNode = rs;
        
        boolean carry = false;
        while(true){
        	int sum = 0;
        	if(node1 == null && node2 == null){
        		break;
        	} else if(node1 == null){
        		sum = node2.val;
        	} else if(node2 == null){
        		sum = node1.val;
        	} else {
        		sum = node1.val + node2.val;
        	}
        	if(carry){
    			sum = sum+1;
    		}
        	
        	ListNode newNode = new ListNode(0);
        	sumNode.next = newNode;
        	sumNode = newNode;
        	
        	if(sum >= 10){
        		sumNode.val = sum -10;
        		carry = true;
        	} else {
        		sumNode.val = sum;
        		carry = false;
        	}
        	if(node1 != null){
            	node1 = node1.next;
        	}
        	if(node2 != null){
            	node2 = node2.next;
        	}
        }
        if(carry){
        	ListNode tmp = new ListNode(1);
        	sumNode.next = tmp;
        }
        if(rs.next == null){
        	return rs;
        } else {
        	return rs.next;
        }
    }

}
