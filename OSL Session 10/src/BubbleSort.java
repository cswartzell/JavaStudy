
public class BubbleSort {
	static void bubblesort(int[] arr) {
		for( int i = 0 ; i < arr.length - 1; i++) {
			for( int j = 0 ; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}
	}
	
	static void printArr(int[] arr) {
		for (int element : arr) {
			System.out.print(element+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] ages = {10, 20, 30, 64, 21, 1, 0};
		BubbleSort.printArr(ages);
		BubbleSort.bubblesort(ages);
		System.out.println();
		BubbleSort.printArr(ages);
	}

}
