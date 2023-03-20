package service;

import dataStr.MyQueue;
import dataStr.MyStack;
import dataStr.Student;

public class MainService {

	public static void main(String[] args) {
			try {
			MyStack charStack = new MyStack();
			
			System.out.println("----INT STACK-----");
			
			System.out.println("-->PUSH<--");
			charStack.push(1);	//1
			charStack.push(2);	//1, 2
			charStack.push(5);	//1, 2, 5
			charStack.push(3); //1, 2, 5, 3
			charStack.print();
			
			System.out.println("-->POP<--");
			
			charStack.pop(3);	//1, 2, 5
			charStack.print();
			
			System.out.println("-->TOP<--");
			
			System.out.println(charStack.top()); //5
			
			System.out.println("-->MAKE EMPTY<--");
			
			charStack.makeEmpty();	//empty stack
			//charStack.print();
			System.out.println("\nStack is empty and right now will be created new element");
			charStack.push(7);	//7
			charStack.print();
			
			System.out.println("-----STUDENT STACK-------");
			
			MyStack <Student> studentStack = new MyStack<>();
		
			System.out.println("-->PUSH<--");
			studentStack.push(new Student("Sofja", "Hohlova", new int [] {6, 6, 9}));	//Sofja Hohlova 6, 6, 9
			studentStack.push(new Student("Luize", "Celme", new int [] {10, 5, 8}));	//Sofja Hohlova 6, 6, 9 Luize Celme 10, 5, 8
			studentStack.push(new Student("Janis", "Roze", new int [] {9, 4, 6}));		//Sofja Hohlova 6, 6, 9 Luize Celme 10, 5, 8 Janis Roze 9, 4, 6
			studentStack.print();
			
			System.out.println("-->POP<--");
			
			studentStack.pop(1);	//Sofja Hohlova 6, 6, 9 Janis Roze 9, 4, 6
			studentStack.print();
			
			System.out.println("-->TOP<--");
			
			System.out.println(studentStack.top());	//Janis Roze 9, 4, 6
			
			System.out.println("-->MAKE EMPTY<--");
			
			studentStack.makeEmpty();
			System.out.println("\nStack is empty and right now will be created new student");
			//studentStack.print();
			studentStack.push(new Student("Liga", "Eglite", new int [] {5, 4, 5}));	
			studentStack.print();
			
			System.out.println("-----QUEUE-----");
			
			MyQueue queueStack = new MyQueue();
			
			System.out.println("-->ENQUEUE<--");
			
			queueStack.enqueue(2);	//2
			queueStack.enqueue(5);	//2 5
			queueStack.enqueue(6);	//2 5 6
			queueStack.enqueue(10); //2 5 6 10
			queueStack.enqueue(4);	//2 5 6 10 4
			queueStack.print();
			
			System.out.println("-->DEQUEUE<--");
			
			queueStack.dequeue();	//5 6 10 4
			queueStack.print();
			queueStack.dequeue();	//6 10 4
			queueStack.print();
			queueStack.dequeue();	//10 4
			queueStack.print();	
			
			System.out.println("-->MAKE EMPTY<--");
			
			queueStack.makeEmpty();	//empty stack
			//charStack.print();
			System.out.println("\nQueue is empty and will be created new elements");
			queueStack.enqueue(8);	//7
			queueStack.enqueue(1);
			queueStack.print();
			
			System.out.println("----STUDENT STACK----");
			MyQueue <Student> studentsStack = new MyQueue<>();
			studentsStack.enqueue(new Student("Karlis", "Vagalis", new int [] {8, 8, 7}));	//Karlis Vagalis 8 8 7
			studentsStack.enqueue(new Student("Inga", "Gulbe", new int [] {2, 8, 6}));		//Karlis Vagalis 8 8 7 Inga Gulbe 2 8 6
			studentsStack.enqueue(new Student("Raitis", "Vairis", new int [] {10, 10, 9})); //Karlis Vagalis 8 8 7 Inga Gulbe 2 8 6 Raitis Vairis 10 10 9
			studentsStack.print();
			
			System.out.println("-->DEQUEUE<--");
			
			studentsStack.dequeue();	
			studentsStack.print();		//Inga Gulbe 2 8 6 Raitis Vairis 10 10 9
			studentsStack.dequeue();
			studentsStack.print();  	//Raitis Vairis 10 10 9
			
			System.out.println("-->MAKE EMPTY<--");
			
			studentsStack.makeEmpty();
			System.out.println("\nStack is empty and right now will be created new student");
			//studentStack.print();
			studentsStack.enqueue(new Student("Viktors", "Naktins", new int [] {7, 4, 5}));	
			studentsStack.print();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
