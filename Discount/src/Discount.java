import java.util.*;
public class Discount {
	public static void checkDiscount(double purchaseAmount)
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount is not Applicable");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter purchaseAmount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		
	}

}
