package main;

public class MultiThreading {

	public static void main(String[] args) {
		//Calling Odd Number Thread
		OddThread oddThread = new OddThread();
		Thread thread = new Thread(oddThread);
		System.out.println(thread.getName());
		thread.start();
		
		//Calling Odd Number Thread
		EvenThread evenThread = new EvenThread();
		System.out.println(evenThread.getName());
		evenThread.start();
	}
}

//Thread class to print odd numbers
class OddThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Odd numbers from 1 to 10");
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
}

//Thread class to print even numbers
class EvenThread extends Thread {
	@Override
	public void run() {
		System.out.println("Even numbers from 1 to 10");
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}
