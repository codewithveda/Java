package Level3;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+ "of the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element to search");
		int key=scan.nextInt();
		Search search=new Search();
		search.linearSearch(arr,key);
	}

}
