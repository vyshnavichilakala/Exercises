//to check uppercase or not using ternary
import java.util.Scanner;
public class Uppercasecheck {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter a alphabet: ");
	char ch = sc.next().charAt(0);
	String cha = (ch>='A' && ch <= 'Z')? ("Alphabet is Uppercase: "):("Alphabet is lower case");
	System.out.println(cha);
	}

}
