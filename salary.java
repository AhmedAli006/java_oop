
import java.util.Scanner;

public class salary {

	public static void main(String[] args) {

		double salary;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your monthly salary:");

		salary = in.nextDouble();
		 

		double tax = salary * 0.15;
		double med = salary *0.05;
		double house = salary * 0.05;
		double traval = salary *0.05;
double totalsalary =  salary - (tax + med + house + traval);
System.out.println("tax deducted : " + tax );
System.out.println("medical tax deducted  :" + med );
System.out.println("house tax deducted  :" + house );
System.out.println("traval tax deducted  :" + traval);

		System.out.println(totalsalary + " rps total salary");

		

	}
}