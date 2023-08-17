import java.util.Scanner;

public class GradeSystem {
	public static void checkGrade(int grade)
	{
		if(grade<50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("pass");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Mark");
		int grade=scan.nextInt();
		checkGrade(grade);
				}

}
