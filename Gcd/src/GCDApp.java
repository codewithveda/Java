import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two to find the gcd");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCD veda=new GCD();
		int result=veda.findgcd(m,n);
		System.out.println(result);
	}

}
