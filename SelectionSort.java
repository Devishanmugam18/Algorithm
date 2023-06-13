public class SelectionSort {
	public static void sorting(int[] arr, int len){

	for(int i = 0; i < len-1; i++){
		int mini = i;
		for(int j = i+1; j < len; j++){
			if(arr[j] < arr[mini]){
				mini = j;
			}
		}
		int temp = arr[mini];
		arr[mini] = arr[i];
		arr[i] = temp;
	}
	System.out.println("After Sorting: ");
	for(int i = 0; i < len; i++){
		System.out.print(arr[i] + " ");
	}
	
	}
	public static void main(String[] args) {
		int[] arr = {13,46,42,24,22,9};
		int len = arr.length;
		System.out.println("Before Sorting: ");
		for(int i:arr){
			System.out.print(i + " ");
		}
		System.out.println();
		sorting(arr,len);
		
		
	}
}
