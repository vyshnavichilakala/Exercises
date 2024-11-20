/**Program to display odd numbers in reverse order

 * 
 */


public class Array6 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
		for(int i= arr.length-1; i>=0; i--) {	
			if(arr[i]%2==1) {
			System.out.println(arr[i]);
			}
		}

	}

}
