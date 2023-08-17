package Level1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" Element of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are...");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}
	}
}


