import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number greater than 100");
		int n=scan.nextInt();
		if(n>100)
		{
		ved(n);
		}
	}
	public static void ved(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
