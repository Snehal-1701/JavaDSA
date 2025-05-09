import java.util.*;

class ReverseArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		System.out.println("Enter elements of array : ");
		int[] arr = new int[size];

		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "	");
		}
		
		System.out.println();

		System.out.println("Reversed array : ");
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for(int i=0; i<arr.length; i++) {
                        System.out.print(arr[i] + "     ");
                }
		System.out.println();

	}
}
