import java.util.Scanner;

public class DivisibleByTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		div(n);
	}
	public static void div(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
