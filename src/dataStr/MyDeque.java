package dataStr;

public class MyDeque<T> {
	//1.variables
		private T[] elements;
		private final int DEFAULT_DECK_SIZE = 10;
		private int dequeSize = DEFAULT_DECK_SIZE;
		private int elementCounter = 0;
		private int front;
		private int rear;
		
	//2.constructors
	//no-args
	public MyDeque() {
		elements = (T[])new Object[dequeSize];	
	}
		
	//args
	public MyDeque(int inputDequeSize) {
		if(inputDequeSize > 0) {
			dequeSize = inputDequeSize;
		}
		elements = (T[])new Object[dequeSize];
	}
		
	//3.functions
		
	/*
	* Izveidot funkciju, kas pārbauda, vai steks ir pilns;
	*/
		
	private boolean isFull() {
		return (elementCounter == dequeSize);
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
	 * increaseDeck() function
	 */
	
	/*
	private void increaseDeck() {
		//1.calculate the new size of the new deck
				int newDeckSize = (dequeSize > 100) ? (int)(dequeSize * 1.5) : dequeSize * 2;
		//2.create new deck
				T[] newElements = (T[])new Object[newDeckSize];
		//3.copy all elements from old deck to the new deck
				for(int i = 0; i < elementCounter; i++) {
					newElements[i] = elements[i];
				}
		//4.change reference to the new deck and it's size
				elements = newElements;
				dequeSize = newDeckSize;
			}
	*/
	
	/*
	 * enqueueAtFront() function, adds element at the front of the deck
	 */
	
	public void enqueueAtFront(T index) throws Exception{
		if(isEmpty()) {
			front = rear = 0;
			elements[front] = index;
		}
		else if(isFull()) {
			throw (new Exception("Full"));
		}
		else {
			front++;
			elements[front] = index;
		}
		elementCounter++;
	}
	
	/*
	 * enqueueAtEnd() adds element at the end of the deck
	 */
	
	public void enqueueAtEnd(T item) throws Exception{
		//1.check if the deck is full
		if(elementCounter == dequeSize) {
			throw (new Exception("Deck is full"));
		}
		else {
		//2.if not equal, it adds the new element at the top of the deck
				elements[elementCounter++] = item;
		}
	}
	
	/*
	 * dequeueFromFront() removes element from the front
	 */
	public void dequeueFromFront() throws Exception {
		//1.check if the queue is empty
			if(isEmpty()) {
				throw (new Exception("Deck is empty"));
			   }
		//2.move all the elements to the left
			for(int i = 0; i < front; i++) {
				elements[i] = elements[i + 1];
			}
		//3.decrease elementCounter and rear
			front--;
		//4.check if the queue is now empty, set -1 to front and rear
			if (elementCounter == 0) {
			       front = -1;
			       rear = -1;
			    }
	}
	
	/*
	 * dequeueFromEnd() removes last element
	 */
	
	public void dequeueFromEnd() throws Exception{	
		//1.check if the queue is empty
		if(isEmpty()) {
			throw (new Exception("Deck is empty"));
		}
		//2.get the front element
		//T rearElement = elements[rear];
		//3.move all the elements to the left
		for(int i = dequeSize; i < elementCounter - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[elementCounter - 1] = null;
		//4.decrease elementCounter and rear
		rear--;
		elementCounter--;
		
	   //return rearElement;
	}
	
	
	/*
	 * print() function
	 */
	public void print() throws Exception{
		if(isEmpty()) {
			throw (new Exception("Deck is empty and it is not possible to print elements"));
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
		elements = (T[])new Object[DEFAULT_DECK_SIZE];
		System.gc();	
	}
}
