package binarysearchtree;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Jan 9, 2017 at 4:17:40 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class BinarySearchtreeByShubham {
	public static Node root;
	public BinarySearchtreeByShubham(){
		this.root = null;
	}
	class Node{
		Node left;
		Node right;
		int data;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	private void insert(int data) {
		Node newNode = new Node(data);
		if(root==null){
			root = newNode;
			return;
		}
		Node parent = null;
		Node current = root;
		while(true){
			parent = current;
			if(data<=current.data){
				current = current.left;
				if(parent.left==null){
					parent.left = newNode; return;
				}
			}else{
				current = current.right;
				if(parent.right==null) {
					parent.right = newNode; return;
				}
			}
		}
		
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String[] args) {
		BinarySearchtreeByShubham b = new BinarySearchtreeByShubham();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);	
	}
}

