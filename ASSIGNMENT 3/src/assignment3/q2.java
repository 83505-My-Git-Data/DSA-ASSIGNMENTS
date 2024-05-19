package assignment3;



class MaxStack {
	private int arr[];
	private int top;
	private int SIZE;
	private int max;
	

	public MaxStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		max =Integer.MIN_VALUE;
		top = -1;
	}

	public void push(int value) {
		if(value>max)
		{
			max =value;
		}
		top++;
		arr[top] = value;
	}

	public void pop() {
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE;
	}
	
	public int returnMax()
	{
		return max;
	}



}
public class q2 {

	public static void main(String[] args) {
		
		MaxStack st = new MaxStack(5);

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("Max ELement: "+ st.returnMax() );  
		
	}

}
