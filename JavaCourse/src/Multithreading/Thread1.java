package Multithreading;
//Scheduler has a job to run the threads
class A extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
		System.out.println("Hii");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class B extends Thread {
	public void run() {
		for(int i=1;i<=100;i++) {
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
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.start();
		try {
			Thread.sleep(2); //Waiting stage 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(obj1.getPriority());
	
		B obj2=new B();
		obj2.start();
		obj2.setPriority(Thread.MAX_PRIORITY);

	}

}
