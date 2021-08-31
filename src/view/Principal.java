package view;
import controller.ThreadsID;

public class Principal {
	public static void main(String[] args) {
		ThreadsID Thread1 = new ThreadsID();
		ThreadsID Thread2 = new ThreadsID();
		ThreadsID Thread3 = new ThreadsID();
		ThreadsID Thread4 = new ThreadsID();
		ThreadsID Thread5 = new ThreadsID();
		Thread1.start();
		Thread2.start();
		Thread3.start();
		Thread4.start();
		Thread5.start();
	}

}
