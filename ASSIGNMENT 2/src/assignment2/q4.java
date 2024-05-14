package assignment2;

import java.util.Arrays;
import java.util.Scanner;



class queue {

	private int arr[];
	private final int SIZE;
	private int front, rear;

	public queue(int size) {
		SIZE = size;

		arr = new int[SIZE];
		front = rear = 0;

	}

	public void push(int value) {
		rear++;
		arr[rear] = value;
	}

	public void pop() {
		front++;
	}
	
	public int peek()
	{
		return arr[front+1];
	}
	
	
	public boolean isFull()

	{
		return rear == SIZE -1;
	}
	
	public boolean isEmpty()

	{
		return rear == front;
	}
	
	
}
public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		queue q = new queue(4);
		int choice;

		do {
			System.out.println("0. Exit\n 1. Push\n 2. Pop\n 3. Peek\n");

			System.out.print("Enter the choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (q.isFull()) {
					System.out.println("the queue is Full");
				} else {
					System.out.print("Enter the Value to insert in queue: ");
					int value = sc.nextInt();
					q.push(value);

				}
				break;
			case 2:

				if (q.isEmpty()) {
					System.out.println("The Queue is Empty");
				} else {
					q.pop();
				}
				break;
			case 3:

				if (q.isEmpty()) {
					System.out.println("The Queue is Empty");
				} else {
					System.out.println("Element: " + q.peek());
				}
				break;

			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}

}
