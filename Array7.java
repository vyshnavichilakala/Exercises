/**Program to find the biggest number in given array

 * 
 */


public class Array7 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int large = arr[0];
	for(int i =0; i<arr.length; i++) {
		if(arr[i]> large) {
			large = arr[i];
		}
	}
		
System.out.println(large);
	}

}
