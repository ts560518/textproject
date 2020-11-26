package kr.co.stack;

public class Stack {
	
	private int stack_size =20;
	private int top;
	private int stackArr[];
	
	public Stack() {
		top = -1;
		stackArr = new int[stack_size];
	}
	
	public int push(int data) {
		if(top>=20) {	// 스택 꽉참
			return 1;
		}
		stackArr[top++] = data;
		return 0;
	}
	
	public int pop() {
		int data;
		if(top == -1) {
			return 0;
		}
		data = stackArr[top];
		top--;		
		return data;
	}
	
	public int peek() {
		if(top != -1) {
			return stackArr[top];
		}
		return 0;
	}
	
	
	
}