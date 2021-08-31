package controller;

public class ThreadsID extends Thread {
	public ThreadsID(){
		
	}
	public void run(){
		System.out.println(getId());
	}
}
