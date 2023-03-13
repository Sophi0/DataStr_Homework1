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
}
