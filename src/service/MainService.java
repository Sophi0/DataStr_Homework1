package service;

import dataStr.MyStack;
import dataStr.Student;

public class MainService {

	public static void main(String[] args) {
		MyStack charStack = new MyStack();
		try {
			System.out.println("-----PUSH-----");
			charStack.push(1);	//1
			charStack.push(2);	//1, 2
			charStack.push(5);	//1, 2, 5
			charStack.push(3); //3, 1, 2, 5
			charStack.print();
			
			System.out.println("-----POP----");
			
			charStack.pop(3);	//3, 1, 2
			charStack.print();
			
			System.out.println("-----TOP----");
			charStack.push(8);
			charStack.top();	//3, 1, 2, 8
			charStack.print();
			
			System.out.println("-----MAKE-EMPTY----");
			
			charStack.makeEmpty();	//empty stack
			//charStack.print();
			charStack.push(7);	//7
			charStack.print();
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
