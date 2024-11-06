//to check 3 numbers are unique or not
import java.util.Scanner;
public class Uniquecheck {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String result = (a!=b && b!=c && c!=a)? ("Numbers entered are unique"):("Numbers enetered are not unique");
	System.out.println(result);
	

	}

}
