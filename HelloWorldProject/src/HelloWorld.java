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

		boolean x = true;

		while(x){
			System.out.println("Choose: 1 Binary to Decimal, 2. Decmial to Binary");
			int type = 0;
		
		while(type != 1 && type !=2){
			System.out.println("What would you like to choose?");
			type = keyB.nextInt();
		}
		if(type==1){
			System.out.println("What Binary number do you want to convert?");
			keyB.nextLine();
			int num = convertBin(keyB.nextLine());
			System.out.println("The Binary converted into: ");
		}
		else{
			System.out.println("What is Decimal number do you want to convert? ");
			String num = convertDec(keyB.nextInt());
		}
		}
		
	
	
	
	
	
	
	}

}
