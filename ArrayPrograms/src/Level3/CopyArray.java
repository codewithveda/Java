package Level3;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" of an array");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();		
		}
		int arr2[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[i]=arr[i];
		}
		System.out.println("original array content are...");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("duplicate array content are..");
		for(int y:arr2)
		{
			System.out.print(y+" ");
		}
	}

}
