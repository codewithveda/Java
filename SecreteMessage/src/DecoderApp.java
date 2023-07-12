import java.util.Scanner;

public class DecoderApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the charcter");
	char ch=scan.next().charAt(0);
	MessageDecoder d1=new MessageDecoder();
	System.out.println(d1.decodeCharacter(ch));
}
}
