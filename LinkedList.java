package CrackingTheCoadingInterview;

public class LinkedList{
	private Node head = null;
	private Node tail = null;
	private int size = 0;

	private void add(int item) {
		Node nn = new Node(item);

		if(head==null) {
			head = tail = nn;
		}else {
			nn.pre = tail;
			tail.next = nn;
			tail = nn;
		}
		size++;
	}

	private void print(LinkedList ll) {
		Node temp = ll.head;
		System.out.print("Size: "+ll.size+" -> ");
		while(temp!=null) {
			System.out.print(temp.item+", ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void delete(int no) {
		Node temp = head;
		Node temp2 = head.next;
		while(temp!=null){
			if(temp2.item==no){
				temp.next = temp.next.next;
				System.out.println(no);
			}
			temp = temp.next;
			temp2 = temp2.next;
		}

		size--;
	}
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.print(ll);
		ll.delete(3);
		ll.print(ll);
		ll.add(3);
		ll.add(22);
		ll.add(12);
		ll.add(43);
		ll.print(ll);


	}
}