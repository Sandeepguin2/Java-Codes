 package DSA.Stack;

public class Stack {
	private int[] arr = new int[5];
	int top;
	int size;

	public Stack() {
		size = arr.length;
		top = -1;
	}

	public void push(int data) {
		top++;
		if (top < size) {

			arr[top] = data;
		}else {
			System.out.println("Stack Over flow");
		}
	}

	public void printStack() {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public int  pop() {
		// TODO Auto-generated method stub
		return arr[top--  ];
	}
	public int  peek() {
		// TODO Auto-generated method stub
		return arr[top];
	}

}
