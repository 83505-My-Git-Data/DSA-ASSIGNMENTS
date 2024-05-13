package assignment1;

public class q7 {

	public static int nonRepeat(int arr[], int n) {

		for (int i = 0; i < n - 1; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}

			if (flag == true) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int n = arr.length;

		int index = nonRepeat(arr, n);

		if (index != -1) {
			System.out.println("The value at the key " + index + " is " + arr[index]);
		} else {

			System.out.println("The value is not available");

		}

	}

}
