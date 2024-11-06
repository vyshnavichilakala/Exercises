// Using only ternary operator 
import java.util.Scanner;
 public class Marks1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		String marks = ((m1+m2+m3+m4)/4>60)? ("Average is above 60"):("Average is below 60");
	System.out.println(marks);
}
 }
