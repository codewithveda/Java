import java.util.Scanner;

public class TenCheck {
	public static void check(int n,int m)
	{
		if(n%m==0)
		{
			System.out.println("Entered Number "+n+" is Multipled by "+m);
			
		}
		else {
			System.out.println("Entered Number "+n+" is not Multipled by "+m);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer");
		System.out.println("Enter second the integer");
		int n=scan.nextInt();
		int m=scan.nextInt();
		check(n,m);
	}

}
