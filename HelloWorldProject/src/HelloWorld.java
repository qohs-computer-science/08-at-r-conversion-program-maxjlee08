import java.util.Scanner;
/*
 * Max Lee
 * 9/18/25
 * 4
 * The program will convert an inputed number into a 8 bit Binary Number
 */
public class HelloWorld {
	public static void main(String[] args) {
		Scanner keyB = new Scanner(System.in);

		System.out.println("Press 1 if you want to print a Binary to Decimal:");
		System.out.println("Press 2 if you want to print a Decimal to Binary:");
		int choice = keyB.nextInt();

		if(choice == 1)
		{
			System.out.println("Input a Binary Number with 1-8 digits");
			int binary = keyB.nextInt();
		}

		if(choice == 2)
		{
			System.out.println("Input a decimal number between 0-127");
			int decimal = keyB.nextInt();
			for(int i=0; i>= 0; i=decimal){
				int remainder = i%2;
				System.out.print(remainder);
			}

		}
	
	
	
	
	
	
	}

}
