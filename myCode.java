package Algorithm;

import java.util.Scanner;



public class myCode  {
	int n;
	Node head;
	Node tail;

	public myCode() {
		int item;
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}

	public class Node{
		Node pre;
		Node next;
		int item;
		String name;
	}
	public void add(int data, String name){
		Node last = tail.pre;
		Node x = new Node();
		x.item = data;
		x.name = name;
		x.next = tail;
		x.pre = last;
		tail.pre = x;
		last.next = x;
		n++;
	}
	public int getSize(){return n;}

	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.println("FOUND ID = "+printNode.item+", FOUND NAME: "+printNode.name+"\n\n");
			printNode = printNode.next;
		}
		//		System.out.println(", Head: "+head.item+", tail: "+tail.item);

	}
	private static void retriveById(myCode dd) {
		System.out.println("Enter ID: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		dd.find(id);
	}
	private static void retriveByName(myCode dd) {
		System.out.println("Enter name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		dd.find(name);
	}
	
	private void find(String name) {
		Node printNode = head.next;
		while (printNode != tail)
		{
			if(printNode.name.equals(name)){
				System.out.println("FOUND ID = "+printNode.item+", FOUND NAME: "+printNode.name+"\n\n");
				break;
			}
			printNode = printNode.next;
		}	
	}
	
	private void find(int id) {
		Node printNode = head.next;
		while (printNode != tail)
		{
			if(printNode.item == id){
				System.out.println("FOUND ID = "+printNode.item+", FOUND NAME: "+printNode.name+"\n\n");
				break;
			}
			printNode = printNode.next;
		}	
	}

	
	
	
	private void addData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Add Employee id and name: ");
		int id = scan.nextInt();
		String name = scan.nextLine();

		Node last = tail.pre;
		Node x = new Node();
		x.item = id;
		x.name = name;
		x.next = tail;
		x.pre = last;
		tail.pre = x;
		last.next = x;
		n++;
	}

	public static void main(String[] args) {
		myCode dd = new myCode();
		dd.add(1, "Shubham");
		dd.add(2, "Harshada");
		dd.add(2, "Rasika");
		while(true){
			System.out.println("Enter your option");
			System.out.println("1. Add data");
			System.out.println("2. Look up by id");
			System.out.println("3. Look up by name:");
			System.out.println("4. Look up all employees:");
			int no = 0;
			Scanner scan = new Scanner(System.in);
			int no1 = scan.nextInt();
			switch (no1) {
			case 1:  dd.addData();
			break;
			case 2:  retriveById(dd);
			break;
			case 3:  retriveByName(dd);
			break;
			case 4:  dd.print();
			break;
			default: dd.print();
			break;
			}
		}

	}
}
