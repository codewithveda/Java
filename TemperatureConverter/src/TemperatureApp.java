import java.util.Scanner;

public class TemperatureApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the temp in F");
	double f=scan.nextDouble();
	Temperature t1=new Temperature();
	System.out.printf("%.2f",t1.convertFahrenheitToCelsius(f));
}
}
