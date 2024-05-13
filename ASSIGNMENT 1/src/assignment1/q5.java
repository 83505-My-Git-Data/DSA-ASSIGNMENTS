package assignment1;

import java.util.Scanner;

public class q5 {

	public static int binarySearch(int arr[], int key, int N) {
		int left = 0;
		int right = N - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = { 77, 66, 55, 44, 33, 22, 11 };

		System.out.print("Enter the key to Find: ");
		int key = sc.nextInt();

		int N = arr.length;

		int index = binarySearch(arr, key, N);
		if (index != -1) {

			System.out.println("The Element at index " + key + " is " + index);
		} else {
			System.out.println("The element is not present in the array");

		}

		sc.close();

	}

}
