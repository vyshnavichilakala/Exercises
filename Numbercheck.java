//To check 3 numbers equal or not using ternary
import java.util.Scanner;
public class Numbercheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = (a==b && b==c)? ("Numbers are equal"):("Numbers are not equal");
		System.out.println(result);

	}

}
