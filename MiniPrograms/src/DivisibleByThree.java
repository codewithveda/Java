import java.util.Scanner;

public class DivisibleByThree {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		veda(n);
	}
	public static void veda(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}

}
