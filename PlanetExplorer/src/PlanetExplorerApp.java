import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=scan.nextDouble();
		PlanetExplorer p1=new PlanetExplorer();
		System.out.println(p1.calculateSurfaceArea(radius));
	}

}
