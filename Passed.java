// Student passed in all 5 subjects using if else if ladder
import java.util.Scanner;
public class Passed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		int subject4= sc.nextInt();
		int subject5 = sc.nextInt();
		if (subject1 >= 40 && subject2 >= 40 && subject3 >= 40 && subject4 >= 40 && subject5 >=50 )
		{
		System.out.println("Student passed in all subjects");
		}
		else
		{
		System.out.println("Student failed in all subjects");
		}
		}
}