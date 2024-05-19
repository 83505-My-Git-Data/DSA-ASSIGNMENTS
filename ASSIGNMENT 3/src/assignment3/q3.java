package assignment3;



class  ReverseStack{
	private int arr[];
	private int top;
	private int SIZE;


	public ReverseStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}

	public void push(int value) {
		top--;
		arr[top] = value;
	}

	public void pop() {
		top++;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == SIZE;
	}

	public boolean isFull() {
		return top == -1;
	}

	public void display() {
		System.out.print("List::");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" " +arr[i] + " ");
		}
	}

	

}

public class q3 {

	public static void main(String[] args) {
		ReverseStack st = new ReverseStack(4);

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		st.display();
		
		

	}

}
