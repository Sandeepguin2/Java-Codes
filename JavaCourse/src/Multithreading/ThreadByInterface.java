package Multithreading;
class Father{
	
}
class Sandeep implements Runnable{
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
class Sanjeeb implements Runnable{
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
public class ThreadByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable s=new Sandeep();
		Runnable s1=new Sanjeeb();
		 Thread t1=new Thread(s);
		 Thread t2=new Thread(s1);
		 
		 t1.start();
		 t2.start();
		

	}

}
