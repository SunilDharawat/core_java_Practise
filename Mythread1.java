package com.Java_Prog.MultiThreading;
// By implemainting Runable interface

class Thread1 implements Runnable {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Child Thread");
		}
		
	}
}
public class Mythread1 {
public static void main(String[] args) {
	Thread1 th=new Thread1();
	Thread t=new Thread(th);
	t.start();
	for(int i=1; i<=10; i++) {
		System.out.println("Main Thread");
	}
	
}
}
