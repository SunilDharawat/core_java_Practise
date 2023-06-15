package com.Java_Prog.MultiThreading;
// By calling run method in main method

class Thread8 extends Thread{
	public void run() {
	System.out.println("Task 1");
	for(int i=1; i<=10; i++) {
		System.out.println("* ");
	}
	System.out.println("Task 1 completed");
	}
}	
public class RunMethod {
public static void main(String[] args) {
	Thread8 t3=new Thread8();
	t3.run(); // work as a normal methods so it is not multithreadin
	for(int i=1; i<=10; i++) {
		System.out.println("+ ");
	}
}
}
