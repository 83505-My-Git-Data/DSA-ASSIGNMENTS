package assignment2;

import java.util.Arrays;

public class q1 {

	public static int insertSort(int arr[], int n) {
		int temp;
		int comps = 0;
		for (int i = 0; i < n; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				comps++;

				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = temp;
		}
		return comps;
	}

	public static void main(String[] args) {

		int arr[] = { 231, 243, 21, 23212, 2, 12 };
		int n = arr.length;
		System.out.println("Array Before Sorting: " + Arrays.toString(arr));
		int comps = insertSort(arr, n);
		System.out.println("Array After Sorting: " + Arrays.toString(arr));
		System.out.println("The Number of Comparisons: " + comps);

	}

}
