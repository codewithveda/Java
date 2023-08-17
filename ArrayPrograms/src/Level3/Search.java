package Level3;

public class Search {
	void linearSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key found at the index of"+i);
				return;
			}
		}
		System.out.println("key is not found");
	}
}
