//To check quantity of fruits in dozens or not using ternary
import java.util.Scanner;
public class Dozens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int quantity = sc.nextInt();
		int value = quantity%12; 
		String result = (value == 0)? ("quantity is in dozens"):("quantity is not in dozens");
		System.out.println(result);
		
	}

}
