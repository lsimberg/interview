package com.interview;

/*
 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 
 https://oj.leetcode.com/problems/add-two-numbers/
 */

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Text {	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode list1 = l1;
		ListNode list2 = l2;
		ListNode resp = null;
		ListNode node = null;
		int carry = 0;
		
		while(list1 != null || list2 != null){
			if (list1 !=null) {
				carry += list1.val;
				list1 = list1.next;
			}
			
			if (list2 !=null) {
				carry += list2.val;
				list2 = list2.next;
			}
						
			if (resp == null) {
				resp = new ListNode(carry % 10);
				node = resp;
			} else {
				node.next = new ListNode(carry % 10);
				node = node.next;
			}

			carry /=  10;
		}

		if (carry == 1 ) node.next = new ListNode(1);
		return resp;
	}
	
	public static void printLinked(ListNode list){
		ListNode l = list;
		while(l != null){
			System.out.print(l.val);
			if (l.next != null ) System.out.print(" -> ");
			l = l.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(4);
		l1_1.next = l1_2;
		ListNode l1_3 = new ListNode(3);
		l1_2.next = l1_3;
		printLinked(l1_1);

		System.out.println();
		ListNode l2_1 = new ListNode(5);
		ListNode l2_2 = new ListNode(6);
		l2_1.next = l2_2;
		ListNode l2_3 = new ListNode(4);
		l2_2.next = l2_3;
		printLinked(l2_1);

		System.out.println();
		ListNode resp = addTwoNumbers(l1_1, l2_1);
		printLinked(resp);
	}
	
}
