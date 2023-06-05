package Copy_Array;

public class Copy_Array {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30};
		
		//create
		int arr1[]=new int[arr.length];
		
		System.out.println("Original array");
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		//copying array in arr1
		for (int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		//display 
		System.out.println("After copying ");
		for(int i=0;i<=arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
	}
}
