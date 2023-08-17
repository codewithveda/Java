import java.util.Scanner;

public class DivisibleByFiveAndTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		lat(n);
		
	}
	public static void lat(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%5==0&& i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
