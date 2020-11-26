package kr.co.queue;

public class Queue {

	private int queue_size = 20;
	private int front;
	private int rear;
	private int queueArr[];
	
	public Queue() {
		front=-1;
		rear=-1;
		queueArr = new int[queue_size];
	}
	
	public boolean isEmpty() {	// 비어있는 큐확인
		if(front == rear) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (rear == queue_size-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enquue (int data) {
		if(isFull()) {
			System.out.println("큐가 꽉찼습니다.");
		}
		queueArr[rear++] = data;
	}
	public int dequeue () {
		int data;
		if(isEmpty()) {
			return 1;
		}
		data = queueArr[front];
		front--;
		return data;
	}
	
	
	
	
	
	
	
	
	
	
}
