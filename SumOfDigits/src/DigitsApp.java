import java.util.Scanner;

public class DigitsApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of digits");
		int n=scan.nextInt();
		Digits digit=new Digits();
		int result=digit.ved(n);
		System.out.println(result);
	}

}
