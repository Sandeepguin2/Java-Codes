package Thread;
class boy implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Sandeep");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class girl implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Lipsa");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Runnable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1=new boy();
		Runnable obj2=new girl();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
