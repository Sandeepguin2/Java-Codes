package Multithreading;
class Raja extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class Rinku extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Lipsa extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Hey");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class OptimizingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raja r=new Raja();
		r.start();
		System.out.println(r.getPriority());
		r.setPriority(Thread.MAX_PRIORITY);
		
		Rinku s=new Rinku();
		s.start();
		System.out.println(s.getPriority());
		s.setPriority(Thread.MIN_PRIORITY);
		
		Lipsa l=new Lipsa();
		l.start();
		System.out.println(l.getPriority());
		l.setPriority(Thread.NORM_PRIORITY);


	}

}
