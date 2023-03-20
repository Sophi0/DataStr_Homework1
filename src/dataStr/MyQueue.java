package dataStr;

public class MyQueue <T>{
	//1.variables
	private T[] elements;
	private final int DEFAULT_STACK_SIZE = 10;
	private int queueSize = DEFAULT_STACK_SIZE;
	private int elementCounter = 0;
	private int front, rear = -1;	//front - first index element; rear - last index element
	
	//2.constructors
	//no-args
	public MyQueue() {
		elements = (T[])new Object[queueSize];	
	}
	
	//args
	public MyQueue(int inputQueueSize) {
		if(inputQueueSize > 0) {
			queueSize = inputQueueSize;
		}
		elements = (T[])new Object[queueSize];
	}
	
	//3.functions
	
	/*
	 * Izveidot funkciju, kas pārbauda, vai steks ir pilns;
	 */
	
	private boolean isFull() {
		return (elementCounter == queueSize);
	}
	
	/*
	 * Izveidot funkciju, kas pārbauda, vai steks ir tukšs;
	 */
	
	private boolean isEmpty() {
		return (elementCounter == 0);
	}
	
	/*
	 * Izveidot funkciju, kas atgriež, cik elementu ir ievietoti stekā;
	 */
	
	public int howManyElements() {
		return elementCounter;
	}
	
	/*
	 * enqueue() funkcija - pievieno elementu rindas galaa
	 */
	public void enqueue(T index) throws Exception{
		//1.check if queue is full
		if(elementCounter == queueSize) {
			throw (new Exception("Queue is full"));
		}
		//2.increment rear by one and add new element 
		rear++;
		elements[rear] = index;
		//3.increase elementCounter
		elementCounter++;
		//4.check if there is the first element, set front index to 0
		if(front == -1) {
			front = 0;
		}
	}
	
	/*
	 * dequeue() funkcija - iznem pirmo elementu no rindas
	 */
	/*
	public T dequeue() throws Exception {
		//1.check if the queue is empty
		 if (isEmpty()) {
		        throw (new Exception("Queue is empty"));
		    }
		 //2.get the front element and increase it
		    T frontElement = elements[front];
		    front++;
		 //3.decrease elementCounter
		    elementCounter--;
		 //4.check if the queue is empty now, set -1 to front and rear
		    if (elementCounter == 0) {
		        front = -1;
		        rear = -1;
		    }
	  
		    return frontElement;
		}
	*/
	/*
	 * dequeue() other method
	 */
	public T dequeue() throws Exception{
		//1.check if the queue is empty
		if(isEmpty()) {
			throw (new Exception("Queue is empty"));
	    }
		//2.get the front element
		T frontElement = elements[front];
		//3.move all the elements to the left
		for(int i = 0; i < rear; i++) {
			elements[i] = elements[i + 1];
		}
		//4.decrease elementCounter and rear
		rear--;
		elementCounter--;
		//5.check if the queue is now empty, set -1 to front and rear
		if (elementCounter == 0) {
	        front = -1;
	        rear = -1;
	    }
  
	    return frontElement;
	}
	
	/*
	 * print() function
	 */
	public void print() throws Exception{
		if(isEmpty()) {
			throw (new Exception("Queue is empty and it is not possible to print elements"));
		}
		else {
			for(int i = 0; i < elementCounter; i++) {
			System.out.print(elements[i] + " ");
	}
			System.out.println();
		}
	}
	
	/*
	 * makeEmpty() function
	 */
	public void makeEmpty() {
		front = -1;
		rear = -1;
		elementCounter = 0;
		elements = (T[])new Object[DEFAULT_STACK_SIZE];
		System.gc();	
	}
	
	
}
