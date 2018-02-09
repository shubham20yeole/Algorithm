package LinkList;

public class DoublyLinkedList  {
	int n;
	Node head;
	Node tail;

	public DoublyLinkedList() {
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
	}
	public void add(int data){
		Node last = tail.pre;
		Node x = new Node();
		x.item = data;
		x.next = tail;
		x.pre = last;
		tail.pre = x;
		last.next = x;
		n++;
	}
	
	private void remove(int no) {
		Node temp = head;
		Node temp2 = head.next;
		while(temp!=tail){
			if(temp2.item==no){
				temp.next = temp.next.next;
				System.out.println(no);
			}
			temp = temp.next;
			temp2 = temp2.next;
		}
	}
	
	public int getSize(){return n;}

	public void print(){
		Node printNode = head.next;
		while (printNode != tail)
		{
			System.out.print(printNode.item+" ");
			printNode = printNode.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		DoublyLinkedList dd = new DoublyLinkedList();
		dd.add(1);
		dd.add(42);
		dd.add(322);
		dd.add(12);
		dd.add(24);
		dd.add(254);
		dd.add(223);
		dd.print();
		dd.remove(223);
		dd.print();
	}
}
