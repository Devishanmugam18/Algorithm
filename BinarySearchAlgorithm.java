import java.util.Scanner;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the length of the array");
		int arrayLength = scan.nextInt();
		int[] sortedArray = new int[arrayLength];
		
		System.out.println("Enter the elements of the array. It must be in sorted order");
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to be searched");
		int searchKey = scan.nextInt();

		int keyIndex = search(sortedArray, arrayLength, searchKey);
		System.out.println("The key is found at index " + keyIndex);
	}

	// Binary search method to search for the key in the array
	public static int search(int[] sortedArray, int arrayLength, int searchKey) {
		// Initialize the left and right indices for the binary search
		int left = 0;
		int right = arrayLength - 1;

		// Continue the binary search until the left and right indices meet
		while (left <= right) {
			// Calculate the middle index
			int mid = (left + right) / 2;

			// If the middle element is the search key, return its index
			if (sortedArray[mid] == searchKey) {
				return mid;
			}
			// If the search key is smaller than the middle element, search the left half of the array
			else if (searchKey < sortedArray[mid]) {
				right = mid - 1;
			}
			// If the search key is larger than the middle element, search the right half of the array
			else {
				left = mid + 1;
			}
		}

		// If the search key is not found in the array, return -1
		return -1;
	}
}
