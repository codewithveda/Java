import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time as real number");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		Calculator c1=new Calculator();
		System.out.printf("%.2f",c1.calculateDistance(speed, time));
	}

}
