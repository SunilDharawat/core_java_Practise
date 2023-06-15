package com.Java_Prog.MultiThreading;
// By extends Thread class 
class Threading extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("child thread");
		}
	}
}
public class Mythread  {	
public static void main(String[] args) {
	Threading t=new Threading();
	t.start();
	
	for(int i=1; i<=10; i++) {
		System.out.println("Main thread");
	}
	
}
}
