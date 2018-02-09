package Algorithms;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Feb 1, 2017 at 1:05:36 PM
 */
public class DoublyLinkedList {
	Node head;
	Node tail;
	int n;
	public DoublyLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}
	class Node{
		Node next;
		Node pre;
		int data;
	}

	public void add(int data){
		Node last = tail.pre;
		Node x = new Node();
		x.data = data;
		x.next = tail;
		x.pre = last;
		last.next = x;
		tail.pre = x;
		n++;
	}
	public void print(){
		Node x = head.next;
		while(x!=tail){
			System.out.print(x.data+", ");
			x=x.next;
		}
		System.out.println();
	}

	//	Given a linked list, delete all nodes that match the target value.
	public void deteteAll(int no){
		Node x = head.next;
		Node p = head;
		while(x!=tail){
			if(x.data==no){
				if(x==head) head = head.next;
				else p.next = x.next;
			}else{
				p = x;
			}
			x=x.next;
		}

	}
	
	public void reverseLinkedList(){
		DoublyLinkedList rl = new DoublyLinkedList();
		Node x = tail.pre;
		while(x!=head){
			rl.add(x.data);
			x = x.pre;
		}
		rl.print();
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dd = new DoublyLinkedList();
		dd.add(1);
		dd.add(2);
		dd.add(3);
		dd.add(4);
		dd.add(3);
		dd.add(5);
		dd.print();
		dd.deteteAll(3);
		dd.print();
		dd.reverseLinkedList();
	}
}

