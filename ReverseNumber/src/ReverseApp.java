import java.util.Scanner;

public class ReverseApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int n=scan.nextInt();
		Reverse reverse=new Reverse();
		int result=reverse.veda(n);
		System.out.println("reversed number is "+result);
		if(n==result)
		{
			System.out.println("Enter number is palindrom");
			
		}
		else
		{
			System.out.println("Enter number is not palindrome");
		}
	}

}
