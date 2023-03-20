package dataStr;

public class MyQueue <T>{
	//1.variables
	private T[] elements;
	private final int DEFAULT_STACK_SIZE = 10;
	private int queueSize = DEFAULT_STACK_SIZE;
	private int elementCounter = 0;
	
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
	
	
	
}
