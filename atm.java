import java.util.Scanner;

public class atm {

	public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter Amount for Withdraw : ");
       int Amount = in.nextInt();
        
	
	System.out.print("\nnotes of 1000 is : " + (Amount % 10000)/1000);
        System.out.print("\nnotes of 100 is : " + (Amount % 1000) / 100);
        System.out.print("\nnotes of 50 is : " + (Amount % 100) / 50);
        System.out.print("\n notes of 10 is : " + (((Amount % 100) % 50) / 10));
        System.out.print("\ncoins of 01 is : " + (((Amount % 100) % 50) % 10));	

}
		

	
}