package dataStr;

public class MyStack {
	//1.variables
	private char[] elements;
	private final int DEFAULT_STACK_SIZE = 6;
	private int stackSize = DEFAULT_STACK_SIZE;
	private int elementCounter = 0;
	
	//2.constructors
	
	//no-args
	public MyStack() {
		elements = new char[stackSize];	//izveidosim masivu ar 6 šūnam(DEFAULT_STACK_SIZE) 
	}
	
	//args
	public MyStack(int inputStackSize) {
		if(inputStackSize > 0) {
			stackSize = inputStackSize;
		}
		elements = new char[stackSize];
	}
	
	//TODO functions
	
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
	
	public void push(char item) {					//funkcija ņem char item kā parametru,
		if(elementCounter == stackSize - 1) {		//ja steka augšdaļā ir max izmēra, tad funkcija izmest paziņojumu, 
			System.out.println("Stack Overflow");	//kas norāda, ka steks ir pilns
		}
		else {
			elementCounter++;
			elements[elementCounter] = item;
		}
	}

	public void push(char item, int x) throws Exception {
	//1.check if the index is equal with element
		if(elementCounter == x) {
	//2.if yes, throw exception		
			throw (new Exception("Stack if full"));
		}
	//3.if not, function adds the new element 'x' to the top of the stack
		elements[elementCounter] = item;
	//4.increase element
		elementCounter++;
	}
	
	//varbūt padomāt kā citādāk izvadīt push() funkciju
	/*
	public void push(char item) {
		if(isFull()) {
			
		}
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
				elements[elementCounter - 1] = 0;
	//6.decrease element
				elementCounter--;
			}
		}
	}
	
	/*
	 * top() function returns the last element of the stack
	 */
	
	//1.create a definition of function top()
	public char top() throws Exception {
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
			throw (new Exception("Array is empty ad it is not possible to print elements"));
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
		elements = new char[stackSize];
		System.gc();	//garbage collector
	}
}
