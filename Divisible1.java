// Number is divisible by both 3 & 5 usinf if-else-if ladder
import java.util.Scanner;
public class Divisible1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n%3 == 0 && n%5 == 0)
		{
		System.out.println("Number is divisible by both 3 & 5");
		}
		else if (n%3 == 0)
		{
		System.out.println("Number is only divisible by 3");
		}
		else if(n%5 == 0)
		{
		System.out.println("Number is only divisible by 5");
		}
		else 
		{
		System.out.println("Number is not divisible by both 3&5");
		}
		// TODO Auto-generated method stub

	}

}
