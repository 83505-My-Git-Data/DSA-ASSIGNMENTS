package assignment1;

import java.util.Scanner;

public class q8 {

	public static int rankFinder(int arr[], int Number) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= Number) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.print("Enter the Number to find Rank: ");
		int num = sc.nextInt();

		int rank = rankFinder(arr, num);

		System.out.println("The rank of the element " + num + " is " + rank);

	}

}
