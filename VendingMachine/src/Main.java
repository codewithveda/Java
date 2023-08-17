import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the code");
		String code=scan.next();
		getProduct(code);
	}
public static void getProduct(String code)
{
	switch(code)
	{
	case "p01":
		System.out.println("Sprite");
		break;
	case "p02":
		System.out.println("Massa");
		break;
	case "p03":
		System.out.println("coca cola");
		break;
	default:
		System.out.println("bovontooo");
		break;
	}
}
}