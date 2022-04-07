package Chapter14.자료구조.queue;

import Chapter14.자료구조.linkedlist.MyLinkedList;

/*
 * A
 * B
 * C
 * A,B,C
 * 
 */
public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue listQueue = new MyListQueue();
		
		listQueue.enqueue("가");
		listQueue.enqueue("나");
		listQueue.enqueue("다");
		listQueue.printAll();
		
		MyListQueue list = new MyListQueue();
		list.dequeue();
		list.printAll();

	}

}
