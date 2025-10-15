package Multithreading;

class Ram extends Thread {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hi");
		}
	}
}

class Shyam extends Thread {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hello");
		}
	}
}

public class ThreadPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram r = new Ram();
		r.start();

		Shyam s = new Shyam();
		s.start();

	}

}
