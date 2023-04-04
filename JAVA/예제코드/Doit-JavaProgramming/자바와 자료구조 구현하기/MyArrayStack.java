package ch04;
import ch02.MyArray;
public class MyArrayStack {
	
	int top;
	MyArray arrayStack;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;

		}
		
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		if(isEmpty() ) {
			System.out.println("stack is empty");
			return arrayStack.ERROR_NUM;
		}
		
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		if(isEmpty() ) {
			System.out.println("stack is empty");
			return arrayStack.ERROR_NUM;
		}
		
		return arrayStack.getElement(top-1);
	}
	
	public int getSize() {
		return top;
	}
	
	public boolean isFull() {
		if (top == arrayStack.ARRAY_SIZE) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top == 0) return true;
		return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
}
