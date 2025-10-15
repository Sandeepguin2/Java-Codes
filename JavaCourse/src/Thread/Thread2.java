package Thread;
//Scheduler has a job to run the threads
class Z{
	
}
class A implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
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
class B implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
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
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1=new A();
		Runnable obj2=new B();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	

	}

}
