package service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import dataStr.MyDeque;
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
			
			charStack.pop();	//1, 2, 5
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
			
			studentStack.pop();	//Sofja Hohlova 6, 6, 9 Luize Celme 10, 5, 8
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
			
			System.out.println("----STUDENT QUEUE----");
			
			MyQueue <Student> studentsQueue = new MyQueue<>();
			
			studentsQueue.enqueue(new Student("Karlis", "Vagalis", new int [] {8, 8, 7}));	//Karlis Vagalis 8 8 7
			studentsQueue.enqueue(new Student("Inga", "Gulbe", new int [] {2, 8, 6}));		//Karlis Vagalis 8 8 7 Inga Gulbe 2 8 6
			studentsQueue.enqueue(new Student("Raitis", "Vairis", new int [] {10, 10, 9})); //Karlis Vagalis 8 8 7 Inga Gulbe 2 8 6 Raitis Vairis 10 10 9
			studentsQueue.print();
			
			System.out.println("-->DEQUEUE<--");
			
			studentsQueue.dequeue();	
			studentsQueue.print();		//Inga Gulbe 2 8 6 Raitis Vairis 10 10 9
			studentsQueue.dequeue();
			studentsQueue.print();  	//Raitis Vairis 10 10 9
			
			System.out.println("-->MAKE EMPTY<--");
			
			studentsQueue.makeEmpty();
			System.out.println("\nStack is empty and right now will be created new student");
			//studentStack.print();
			studentsQueue.enqueue(new Student("Viktors", "Naktins", new int [] {7, 4, 5}));	
			studentsQueue.print();
			
			System.out.println("-----DECK-----");
			
			MyDeque dequeStack = new MyDeque();
			
			System.out.println("-->ENQUEUE AT FRONT<--");
			
			dequeStack.enqueueAtFront(7);
			dequeStack.enqueueAtFront(3);
			dequeStack.enqueueAtFront(44);
			dequeStack.enqueueAtFront(72);
			dequeStack.enqueueAtFront(13);
			dequeStack.enqueueAtFront(42);
			
			
			dequeStack.print();
			
			System.out.println("-->ENQUEUE AT END<--");
			
			dequeStack.enqueueAtEnd(8);
			dequeStack.enqueueAtEnd(134);
			dequeStack.enqueueAtEnd(586);
	
			dequeStack.print();
			
			System.out.println("-->DEQUEUE FROM FRONT<--");
			
			dequeStack.dequeueFromFront();
			dequeStack.print();
			
			System.out.println("-->DEQUEUE FROM END<--");
			
			dequeStack.dequeueFromEnd();
			dequeStack.print();
			
			System.out.println("-->MAKE EMPTY<--");
			
			dequeStack.makeEmpty();
			//dequeStack.print();
			System.out.println("Deck is empty and right now will add new elements");
			dequeStack.enqueueAtFront(74);
			dequeStack.enqueueAtFront(31);
			
			dequeStack.enqueueAtEnd(38);
			
			dequeStack.print();
			
			System.out.println("-----STUDENT DECK-------");
			
			MyDeque <Student> studentDeck = new MyDeque<>();
			
			System.out.println("-->ENQUEUE AT FRONT<--");
			
			studentDeck.enqueueAtFront(new Student("Keita", "Olaine", new int [] {8, 8, 7}));		//Karlis Vagalis 8 8 7
			studentDeck.enqueueAtFront(new Student("Patricija", "Šmite", new int [] {6, 6, 6}));  	//Karlis Vagalis 8 8 7 Patricija Šmite 6 6 6
			
			studentDeck.print();
			
			System.out.println("-->ENQUEUE AT END<--");
			
			studentDeck.enqueueAtEnd(new Student("Grigorijs", "Ivanovs", new int [] {4, 3, 7}));	//Karlis Vagalis 8 8 7 Patricija Šmite 6 6 6 Grigorijs Ivanovs 4 3 7
			studentDeck.enqueueAtEnd(new Student("Olegs", "Petrovs", new int [] {8, 2, 9}));		//Karlis Vagalis 8 8 7 Patricija Šmite 6 6 6 Grigorijs Ivanovs 4 3 7 Olegs Petrovs 8 2 9
			
			studentDeck.print();
			
			System.out.println("-->DEQUEUE FROM FRONT<--");
			
			studentDeck.dequeueFromFront();
			studentDeck.print();
			
			System.out.println("-->DEQUEUE FROM END<--");
			
			studentDeck.dequeueFromEnd();
			studentDeck.print();
			
			System.out.println("-->MAKE EMPTY<--");
			
			dequeStack.makeEmpty();
			//dequeStack.print();
			System.out.println("Deck is empty and right now will add new students");
			
			studentDeck.enqueueAtFront(new Student("Eva", "Pole", new int [] {9, 5, 7}));		//Karlis Vagalis 8 8 7
			studentDeck.enqueueAtFront(new Student("Maksims", "Ulmanis", new int [] {10, 10, 9})); 

			studentDeck.print();
			
			System.out.println("-----PHONE CALLS-----");
			
			MyQueue<String> calls = new MyQueue<>();
			
			Random rand = new Random();
				try {
			for(int i = 0; i < 20; i++) {
				String phoneNumber = generatePhoneNumber();
				System.out.println("New call: " + phoneNumber);
				calls.enqueue(phoneNumber);
				
				Thread.sleep(rand.nextInt(3000));
			}
			
			while(!calls.equals(null)) {
				String phoneNumber = calls.dequeue();
				System.out.println("Answering call: " + phoneNumber);
			}
		
				Thread.sleep(rand.nextInt(6000 - 1000) + 1000);
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static String generatePhoneNumber() {
        Random rand = new Random();
        String phoneNumber = "+371 2";
        for (int i = 0; i < 8; i++) {
            phoneNumber += rand.nextInt(10);
        }
        return phoneNumber;
    }
	
	
}
