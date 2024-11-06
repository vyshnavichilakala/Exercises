//Condition to check a person is eligible to vote
 import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc. nextInt();
	String result = (age >=18 )? ("Person eligible to vote"):("Person is under age of 18");
	System.out.println(result);

	}

}
