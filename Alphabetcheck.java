//to check Alphabet or not using if else
import java.util.Scanner;
public class Alphabetcheck {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter a alphabet: ");
	char ch = sc.next().charAt(0);
	if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z'))
	{
	System.out.println(ch +" is an alphabet");
	}
	else
	{
	System.out.println(ch +" is not an alphabet");
	}

}
}