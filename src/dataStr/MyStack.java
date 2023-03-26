package dataStr;

public class MyStack <T>{
	//1.variables
	private T[] elements;
	private final int DEFAULT_STACK_SIZE = 10;
	private int stackSize = DEFAULT_STACK_SIZE;
	private int elementCounter = 0;
	
	//2.constructors
	
	//no-args
	public MyStack() {
		elements = (T[])new Object[stackSize];	//izveidosim masivu ar 10 šūnam(DEFAULT_STACK_SIZE) 
	}
	
	//args
	public MyStack(int inputStackSize) {
		if(inputStackSize > 0) {
			stackSize = inputStackSize;
		}
		elements = (T[])new Object[stackSize];
	}
	
	//functions
	
	/*
	 * Izveidot funkciju, kas pārbauda, vai steks ir pilns;
	 */
	
	private boolean isFull() {
		return (elementCounter == stackSize);
	}
	
	/*
	 * Izveidot funkciju, kas pārbauda, vai steks ir tukšs;
	 */
	
	public boolean isEmpty() {
		return (elementCounter == 0);
	}
	
	/*
	 * Izveidot funkciju, kas atgriež, cik elementu ir ievietoti stekā;
	 */
	
	public int howManyElements() {
		return elementCounter;
	}
	
	
	/*
	 * push() funkcija adds element to the end of the stack
	 */
	
	public void push(T item) throws Exception {
		//1.check with exception if elementCounter compared with stackSize
		if(elementCounter == stackSize) {		 
			throw(new Exception("Stack is full"));	
		}
		//2.if not equal, it adds the new element at the top of the stack
		else {
			elements[elementCounter++] = item;
		}
	}

	/*
	 * pop() funkcija removes the last element of the stack.
	 */
	public void pop() throws Exception {
		//1.verify isEmpty
			if(isEmpty()) {
				throw(new Exception("Stack is empty and it is not possible to remove elements"));	
			}
				else {
		//2.copy elements from index to end
					for(int i = stackSize; i < elementCounter - 1; i++) {
						elements[i] = elements[i + 1]; 	//iet pa labi
					}
		//3.initialize the last element with NULL symbol (int value is 0)
					elements[elementCounter - 1] = null;
		//4.decrease element
					elementCounter--;
				}
			}
		
	
	/*
	 * top() function returns the last element of the stack
	 */
	
	//1.create a definition of function top()
	public T top() throws Exception {
	//2.make a check if the stack is empty, if yes, throws exception
		if(elementCounter == 0) {
			throw (new Exception("Stack is empty")); 
		}
	//3.if not empty, the function returns the top element of the stack
		return elements[elementCounter - 1];	//pa kreisi
	}
	
	/*
	 * print() function
	 */
	
	public void print() throws Exception{
		if(isEmpty()) {
			throw (new Exception("Stack is empty and it is not possible to print elements"));
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
		stackSize = DEFAULT_STACK_SIZE;
		elementCounter = 0;
		elements = (T[])new Object[stackSize];
		System.gc();	//garbage collector
	}
}
