package Chapter14.자료구조.stack;

import Chapter14.자료구조.array.MyArrayList;

public class MyArrayStack {

	int top;
	MyArrayList arrayList;
	
	public MyArrayStack() {
		top = 0;
		arrayList = new MyArrayList();
	}
	
	public MyArrayStack(int size) {
		arrayList = new MyArrayList(size);		
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayList.addElement(data);
		top++;
	}
	public boolean isFull() {
		if(top == arrayList.ARRAY_SIZE) {
			return true;
		}
		else
			return false;
	}
	
	public void printAll() {
		arrayList.printAll();
	}

	public int pop() {
		if(top == 0) {
			System.out.println("stack is empty");
			return MyArrayList.ERROR_NUM;
		}
		return arrayList.removeElement(--top);
	}
	
	public int getSize() {
		return top;
	}

}
