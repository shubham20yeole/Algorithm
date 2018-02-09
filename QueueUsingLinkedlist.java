package Algorithms;


/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 9:48:05 PM
 */
// Implement Queues using LinkedList

public class QueueUsingLinkedlist {
	Node head;
	Node tail;
	int n = 0;
	public QueueUsingLinkedlist() {
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
		Node first = head.next;
		int data = first.data;
		System.out.println("POP: "+data);
		head  = first;
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
		QueueUsingLinkedlist stack = new QueueUsingLinkedlist();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.displayStack();
		stack.pop();
		stack.displayStack();
		
	}
}