/** Program to swap first and last elements of the array

 * 
 */
public class Array4 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	for(int i=0; i<arr.length; i++) {
	int temp = arr[0];
	arr[0]= arr[arr.length-1];
	arr[arr.length-1] = temp;
	}
	for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);	
	}

	}

}
