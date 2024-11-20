/**write a program to display the multiplication table of each number in the given array

 * 
 */
public class Array8 {
public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i =0; i < arr.length; i++) {
			for(int j =1; j<=10; j++) {
				System.out.println(arr[i] + "x" + j + "=" + arr[i]*j);
				}
			System.out.println("-----");
		}

	}

}
