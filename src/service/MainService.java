package service;

import dataStr.MyStack;
import dataStr.Student;

public class MainService {

	public static void main(String[] args) {
		MyStack charStack = new MyStack();
		try {
			System.out.println("----INT-STACK------");
			
			System.out.println("-----PUSH-----");
			charStack.push(1);	//1
			charStack.push(2);	//1, 2
			charStack.push(5);	//1, 2, 5
			charStack.push(3); //1, 2, 5, 3
			charStack.print();
			
			System.out.println("-----POP----");
			
			charStack.pop(3);	//1, 2, 5
			charStack.print();
			
			System.out.println("-----TOP----");
			
			System.out.println(charStack.top()); //5
			
			System.out.println("-----MAKE-EMPTY----");
			
			charStack.makeEmpty();	//empty stack
			//charStack.print();
			System.out.println("Stack is empty and right now will be created new element");
			charStack.push(7);	//7
			charStack.print();
			
			System.out.println("-----STUDENT STACK--------");
			
			MyStack <Student> studentStack = new MyStack<>();
		
			System.out.println("-----PUSH-----");
			studentStack.push(new Student("Sofja", "Hohlova", new int [] {6, 6, 9}));	//Sofja Hohlova 6, 6, 9
			studentStack.push(new Student("Luize", "Celme", new int [] {10, 5, 8}));	//Sofja Hohlova 6, 6, 9 Luize Celme 10, 5, 8
			studentStack.push(new Student("Janis", "Roze", new int [] {9, 4, 6}));		//Sofja Hohlova 6, 6, 9 Luize Celme 10, 5, 8 Janis Roze 9, 4, 6
			studentStack.print();
			
			System.out.println("-----POP----");
			
			studentStack.pop(1);	//Sofja Hohlova 6, 6, 9 Janis Roze 9, 4, 6
			studentStack.print();
			
			System.out.println("-----TOP----");
			
			System.out.println(studentStack.top());	//Janis Roze 9, 4, 6
			
			System.out.println("-----MAKE-EMPTY----");
			
			studentStack.makeEmpty();
			System.out.println("Stack is empty and right now will be created new student");
			//studentStack.print();
			studentStack.push(new Student("Liga", "Eglite", new int [] {5, 4, 5}));	
			studentStack.print();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
