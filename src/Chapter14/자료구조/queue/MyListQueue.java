package Chapter14.자료구조.queue;

import Chapter14.자료구조.array.MyArrayList;
import Chapter14.자료구조.linkedlist.MyLinkedList;
import Chapter14.자료구조.linkedlist.MyListNode;

interface IQueue{
	void enqueue(String data);
	void dequeue();
	void printAll();
	
}

public class MyListQueue extends MyLinkedList implements IQueue{
	MyListNode front;
	MyListNode rear;
	
	
	
	public MyListQueue() {
		front = null;
		rear = null;
		
	}

	@Override
	public void enqueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {						//처음 항목을 들어가는 경우
			newNode = addElement(data);
			front = newNode;
			rear = newNode;	
		}
		else {								//맨 뒤에 들어가는 경우
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData()+" 추가됨");
		
	}

	@Override
	public void dequeue() {
		
		
		
		
	
		
	}	
		
		
		

	
	@Override
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		MyListNode temp = front;
		while(temp != null) {
			System.out.print(temp.getData()+ ", ");
			temp = temp.next;
		}
		System.out.println();
	}

}
