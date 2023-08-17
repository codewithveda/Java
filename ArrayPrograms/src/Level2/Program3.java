package Level2;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("before swapping");
		for(int x:arr)
		{
			
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter the first index");
		int index1=scan.nextInt();
		System.out.println("enter the second index");
		int index2=scan.nextInt();
		int temp;
		temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println("after swapping");
		for(int y:arr)
		{
			
			System.out.print(y+" ");
		}
	}

}
