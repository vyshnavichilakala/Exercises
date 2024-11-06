//Condition to check first num is greater than both second & third number or not using ternary
import java.util.Scanner;
public class Firstnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String value = (a>b && a>c)? ("First number is greater"):("First number is not greater than both");
		System.out.println(value);
		
		
		// TODO Auto-generated method stub

	}

}
