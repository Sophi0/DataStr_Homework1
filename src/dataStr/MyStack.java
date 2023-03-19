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
		elements = (T[])new Object[stackSize];	//izveidosim masivu ar 6 šūnam(DEFAULT_STACK_SIZE) 
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
	 * push() funkcija adds element x to the stack
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
	public void push(int item, int x) throws Exception {
		//1.check if elementCounter equal with stackSize, otherwise throw an exception
		if(elementCounter == stackSize) {
			throw(new Exception("Stack is full"));
		}
		//2.check if 'x' is greater than 0 and smaller or equal than elementCounter, otherwise throw an exception
		if(x < 0 || x >= elementCounter) {
			throw (new Exception("Wrong index"));
		}
		//3.with 'for' loop element will move after 'x' to make space for the new element. Function started from the last element and goes up to 'x'
		for(int i = elementCounter - 1; i >= x; i--) {	//move elements to make
			elements[i + 1] = elements[i];				//space for the new element
		}
		//4.next up is to add a new element
		elements[x] = item;
		//5.increase elementCounter
		elementCounter++;
			
		}
*/	
	/*
	 * pop() funkcija removes the last element of the stack.
	 */
	
	//1.create a definition of function pop()
	public void pop(int item) throws Exception {
	//2.verify isEmpty
		if(isEmpty()) {
			throw(new Exception("Stack is empty and it is not possible to remove elements"));	
		}
		else {
	//3.verify the index - is it appropriate
			if(item < 0 || item >= elementCounter) {
				throw(new Exception("Wrong index"));
			}
			else {
	//4.copy elements from index to end
				for(int i = item; i < elementCounter - 1; i++) {
					elements[i] = elements[i + 1]; 	//iet pa labi
				}
	//5.initialize the last element with NULL symbol (int value is 0)
				elements[elementCounter - 1] = null;
	//6.decrease element
				elementCounter--;
			}
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
			throw (new Exception("Array is empty and it is not possible to print elements"));
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
