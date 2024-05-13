package assignment1;

import java.util.Scanner;

public class q6 {

	public static int linSearch(int arr[], int n, int key, int occ) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
			if(count == occ)
			{
				return i;
			}
			
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 11, 33, 44, 11, 66, 22, 33, 44, 88, 99, 11, 55, 11 ,88};

		System.out.print("Enter the Key to Search: ");
		int key = sc.nextInt();
		System.out.print("Enter the occurence to be found: ");
		int occ = sc.nextInt();
		int n = arr.length;
		int index = linSearch(arr, n - 1, key, occ);
		if (index != -1) {
			System.out.println("The Value " + key + " is at index " + index);

		} else {
			System.out.println("The Element You Entered is not present in array");
		}

	}

}
