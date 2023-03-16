package service;

import dataStr.MyStack;

public class MainService {

	public static void main(String[] args) {
		MyStack charStack = new MyStack();
		try {
			System.out.println("-----PUSH-----");
			charStack.push('a');	//a
			charStack.push('b');	//a, b
			charStack.push('d');	//a, b, d
			charStack.push('n', 0); //n, a, b, d
			charStack.print();
			
			System.out.println("-----POP----");
			
			charStack.pop(3);	//n, a, d
			charStack.print();
			
			System.out.println("-----TOP----");
			charStack.push('z');
			charStack.top();	//n, a, b, d
			charStack.print();
			
			System.out.println("-----MAKE-EMPTY----");
			
			charStack.makeEmpty();	//empty stack
			//charStack.print();
			charStack.push('a');	//a
			charStack.print();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
