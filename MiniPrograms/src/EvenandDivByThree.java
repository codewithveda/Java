import java.util.Scanner;

public class EvenandDivByThree {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		veda(n);
	}
	public static void veda(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					System.out.println(i);
				}
			}
		}
	}

}
