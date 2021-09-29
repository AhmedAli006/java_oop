import java.util.Scanner;
class marksheet{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);

	System.out.println("enter marks of english");
	int eng = sc.nextInt();

	System.out.println("enter marks of physics");
	int phy = sc.nextInt();

	System.out.println("enter marks of chemistry");
	int chem = sc.nextInt();

	System.out.println("enter marks of biology");
	int bio = sc.nextInt();

	System.out.println("enter marks of urdu");
	int urdu = sc.nextInt();

	System.out.println("enter marks of PST");
	int pst = sc.nextInt();

int result=eng+phy+chem+bio+urdu+pst;
int persentage = result * 100/600;
System.out.println("your persentage is  : " + persentage + "%");


}
}
