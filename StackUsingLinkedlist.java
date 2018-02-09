package Algorithms;

import Algorithms.DoublyLinkedList.Node;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 9:30:46 PM
 */

// Implement Stack using LinkedList

public class StackUsingLinkedlist {
	Node head;
	Node tail;
	int n = 0;
	public StackUsingLinkedlist() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}
	class Node{
		Node pre;
		Node next;
		int data;
	}
	public void push(int data){
		Node last = tail.pre;
		Node x = new Node();
		x.data = data;
		x.next = tail;
		x.pre = last;
		tail.pre = x;
		last.next = x;
		n++;
	}
	private void pop() {
		Node last = tail.pre.pre;
		int data = last.next.data;
		System.out.println("POP: "+data);
		last.next = tail;
	}
	private void displayStack() {
		System.out.print("Stack: ");
		Node displayNode = head.next;
		while(displayNode!=tail){
			System.out.print(displayNode.data+", ");
			displayNode = displayNode.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackUsingLinkedlist stack = new StackUsingLinkedlist();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.displayStack();
		stack.pop();
		stack.displayStack();
		
	}
}

