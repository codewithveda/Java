import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		ages(age);
	}
	public static void ages(int age)
	{
		if(age>0 && age<=12)
		{
			System.out.println("its child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("its teen");
		}
		else if (age>=20 && age<=59)
		{
			System.out.println("its adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}
