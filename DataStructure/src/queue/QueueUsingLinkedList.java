package queue;

class QNode {
	int data;
	QNode next;

	QNode(int data) {
		this.data = data;
		next = null;
	}
}

public class QueueUsingLinkedList {

	QNode front, rear;

	public QueueUsingLinkedList() {
		this.front = this.rear = null;
	}
	
	public void enqueue(int key) {
		
		QNode tempnode = new QNode(key);
		if(this.rear == null) {
			this.front = this.rear = tempnode;
			//return;
		}
		
		this.rear.next = tempnode;
		this.rear = tempnode;
	}
	
	public QNode dequeue() {
		if(this.front == null) {
			return null;
		}
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null) {
			this.rear = null;
		}
		return temp;
	}

	public static void main(String[] args) {
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.dequeue().data);
	}
}
