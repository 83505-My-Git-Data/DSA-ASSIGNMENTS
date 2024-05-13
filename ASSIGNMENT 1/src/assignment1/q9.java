package assignment1;

import java.util.Arrays;

public class q9 {


	public static int selSort(int arr[], int N) {
		int comparisons =0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					comparisons++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return comparisons;
	}

	public static void main(String[] args) {

		int arr[] = { 66, 74, 456, 43, 5, 544, 3 };

		System.out.println("Array Before Sorting: " + Arrays.toString(arr));
		int comps = selSort(arr, arr.length);
		System.out.println("Array After Sorting: " + Arrays.toString(arr));
		System.out.println("No of Comparisons: " + comps);
		

	}

}
