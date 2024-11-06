//condition to check vowel or not using if else
import java.util.Scanner;
public class Charactercheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character: ");
	char ch = sc.next().charAt(0);
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println("Charcater you entered is vowel");
	}
	else
	{
	System.out.println("Character you enetered is not a vowel");
	}
	

	}

}
