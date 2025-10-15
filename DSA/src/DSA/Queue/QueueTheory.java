package DSA.Queue;

public class QueueTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(54);;
		queue.enqueue(91);
		System.out.println(queue.dequeue());
//		queue.show();
		queue.enqueue(12);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
//		
		

	}

}
