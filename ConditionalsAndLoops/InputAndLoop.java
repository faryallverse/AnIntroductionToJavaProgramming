//Taking user input and use it in do while loop

import java.util.Scanner;

public class InputAndLoop{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		do{
			System.out.println("Enter you 4-digit PIN: ");
			value = scanner.nextInt();
		}while(value!=1234);
		
		System.out.println("Correct PIN");
	}
}