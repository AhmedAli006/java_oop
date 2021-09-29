

import java.util.Scanner;

public class currency {

	public static void main(String[] args) {

		double money;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter currency in PKR:");

		money = in.nextDouble();
		double result = money * 167.98;
		System.out.println(result + " $");

		double result = money * 198.77;
		System.out.println(result + " euro");

		double result = money * 132.85;
		System.out.println(result + " Canadian Dollar");

		double result = money * 1.53;
		System.out.println(result + " yen");
		

	}
}