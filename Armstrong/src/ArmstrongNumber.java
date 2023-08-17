public class ArmstrongNumber {
	public static void veda(int n)
	{
		int sum=0;
		int temp=n;
		while(n!=0)
		{
		int rem=n%10;
		n=n/10;
		sum=sum+rem*rem*rem;
		}
		if(temp==sum)
		{
			System.out.println("its armstrong number");
	     }
		else {
			System.out.println("its not armstrong number");
		}
	}

}
