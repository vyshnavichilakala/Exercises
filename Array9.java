/** Program to find the factorial of each number in the given array

 * 
 */

public class Array9 {
public static void main(String[] args) {
		int[] arr = {4,5};
		for(int i =0; i<arr.length; i++) {
			int arrs = arr[i];
			long factorial =1;
			for(int j=1; j<=arrs; j++ ) {
				factorial *=j;
			}
			System.out.println(arrs+factorial);	
		}
		
	}

}
