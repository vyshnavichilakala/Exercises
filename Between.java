// To check number is in between 30 & 50 using ternary operator
import java.util.Scanner;
public class Between {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		String val = (n>=30 && n<=50)? ("Number is in between"):("Number is not in between");
		System.out.println(val);
		

	}

}
