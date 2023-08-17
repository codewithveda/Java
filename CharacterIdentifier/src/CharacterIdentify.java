import java.util.Scanner;

public class CharacterIdentify {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character to check wheater it is digit or vowel or consonent");
		char ch=scan.next().charAt(0);
		check(ch);
		
	}
	public static void check(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Enter charchter"+ch+" id digit ");
			
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("entered characher"+ch+ " is special character");
			
		}
		else
		{
			switch (Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered character is "+ch+" is lowercase vowel");
					
				}
				else {
					System.out.println("Entered character is "+ch+" is upercase vowel");
				}
				break;
				default:
					if(Character.isLowerCase(ch))
					{
						System.out.println("Entered character is "+ch+" is lowercase consonent");
					}
					else
					{
						System.out.println("Entered character is "+ch+" is uppercase consonent");
					}
			}
		}
	}

}
