package Level2;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int x:arr)
		{
			if(x>=0)
			{
				System.out.print(x+" ");
			}
		}
		
	}

}
