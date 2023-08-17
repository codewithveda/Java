package Level3;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+ "of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Element to search");
		int key=scan.nextInt();
		SubClass s1=new SubClass();
		boolean res=s1.isPresent(arr,key);
		if(res==true)
		{
			System.out.println("Target Found in array");
		}
		else
		{
			System.out.println("Target not Found ");
		}
	}

}
