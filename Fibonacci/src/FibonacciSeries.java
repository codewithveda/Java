import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Fibonacci Number");
		int n=scan.nextInt();
		veda(n);
	}
	public static void veda(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1)
		{
			System.out.print(fib1);
		}
		else if(n==2)
		{
			System.out.print(fib1+" "+fib2);
		}
		else
		{
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++)
			{
				int next=fib1+fib2;
				System.out.print(next+" ");
				fib1=fib2;
				fib2=next;
			}
		}
		
	}
	

}
