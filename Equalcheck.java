//to check 2 numbers equal or not among 3 numbers using ternary
import java.util.Scanner;
public class Equalcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = (a==b || b==c || c==a)? ("Two numbers are equal"):("Any number is not equal");
		System.out.println(result);
		

	}

}
