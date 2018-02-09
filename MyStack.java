package LinkList;

//
class Node{
	Node pre;
	Node next;
	int data;
}

public class MyStack{

	private Node head;
	private Node tail;
	private int size;

	public MyStack(){

		// create head, tail and then join them
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}

	// PUSH
	// 1 2 3 4 5 6 7
	public void push(int data){

		Node last = tail.pre;

		// create a new node
		Node newNode = new Node();
		newNode.data = data;

		// attach tail and then pre
		newNode.next = tail;
		newNode.pre = last;


		// change new node as tail
		tail.pre = newNode;
		last.next = newNode;

		// increment Stack size
		size++;

	}

	// pop()
	// 5 is last
	// return 5 
	// delete 5
	// change tail as 4


	// check if stack is empty
	// 

	//POP
	public int pop(){
		if(size==0) return 0;
		else{

			// take note of tail
			Node popNode = tail.pre;

			// delete tail
			Node last = tail.pre.pre;
			last.next = last.next.next;


			// assign new tail
			last.next = tail;
			tail.pre = last;

			// return note taken at start

			return popNode.data;
		}

	}

	public boolean isEmpty(){
		if(size==0) return true;
		else return false;

	}


	public static void main(String[] args){
		MyStack st = new MyStack();
		st.push(1);
		st.push(2);
		st.push(33);
		st.push(12);
		st.print();
		System.out.println("POP element: "+st.pop());
		st.print();
	}

	private void print() {
		Node n = head.next;
		while(n!=tail) {
			System.out.print(n.data+", ");
			n=n.next;
		}
		System.out.println();
	}
}