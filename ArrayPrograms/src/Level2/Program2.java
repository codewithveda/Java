package Level2;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=scan.nextInt();
		System.out.println("Enter the second number");
		int y=scan.nextInt();
		System.out.println("Before swapping "+x+" "+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping "+x+" "+y);
	}

}
