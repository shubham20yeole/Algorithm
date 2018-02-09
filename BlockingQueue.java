package MultiThreading;

import java.util.*;

public class BlockingQueue {
	private List<Object> queue;
	private int size = 0;
	
	public BlockingQueue(int size) {
		queue = new LinkedList<Object>();
		this.size = size;
	}
	
	public synchronized void enqueue(Object item) throws InterruptedException{
		if(this.queue.size()==this.size) {
			wait();
		}
		if(this.queue.size()==0) notifyAll();
		
		this.queue.add(item);
	}
	
	public synchronized Object dequeue(Object item) throws InterruptedException {
		if(this.queue.size()==0) {
			wait();
		}
		if(this.queue.size()==this.size) notifyAll();
		
		return this.queue.remove(item);
	}
}

