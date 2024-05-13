package assignment1;

import java.util.Scanner;

public class q2 {
	
	public static int linSearch(int arr[], int n, int key)
	{

		for(int i =n;i>0;i--)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11,33,44,11,66,22,33,44,88,99};
		
		System.out.println("Enter the Key to Search");
		int key = sc.nextInt();
		int n= arr.length;
		int index = linSearch(arr,n-1,key);
		if(index!=-1)
		{
			System.out.println("The Value " + key + " is at index " +index);
			
		}
		else {
			System.out.println("The Element You Entered is not present in arrya");
		}

	}

}
