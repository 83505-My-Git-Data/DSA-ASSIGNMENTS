package assignment1;

import java.util.Scanner;

public class q3 {

	public static int binarysearch(int arr[], int key, int N) {
		int comparisonsBinSearch = 0;
		int left = 0;
		int right = N - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;
			comparisonsBinSearch++;
			if (arr[mid] == key) {
				return comparisonsBinSearch;
			} else if (arr[mid] > key) {

				right = mid - 1;
			} else {

				left = mid + 1;
			}
		}

		return comparisonsBinSearch;
	}
	
	
	
	public static int linSearch(int arr[], int n, int key)
	{
		 int linSearchComparisons=0;
		for(int i = 0; i < n; i++)
		{
			linSearchComparisons++;
			if(arr[i] == key)
			{
				return linSearchComparisons;
			}
		}
		
		return linSearchComparisons;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 55, 66, 77 };

		System.out.print("Enter the key to Find: ");
		int key = sc.nextInt();

		int N = arr.length;

		int comparisons = binarysearch(arr, key, N);

		int comparisonsLinSearch = linSearch(arr,N-1,key);

		System.out.println("In Binary Search The Comparisons to search for index " + key + " is " + comparisons);
		
		System.out.println("In Linear Search The Comparisons to search for index " + key + " is " + comparisonsLinSearch);


		sc.close();

	}

}
