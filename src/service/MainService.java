package service;

import dataStr.MyStack;

public class MainService {

	public static void main(String[] args) {
		MyStack charStack = new MyStack();
		try {
			charStack.push('a');	//a
			charStack.push('b');	//a, b
			charStack.push('d');	//a, b, d
			charStack.push('n', 0); //n, a, b, d
			
			charStack.print();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
