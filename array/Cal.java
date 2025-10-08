package array;
import java.util.Scanner;

public class Cal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		int input;
		
		System.out.print("Enter numebr1 : ");
		number1 = sc.nextInt();
		System.out.print("Enter number2 : ");
		number2 = sc.nextInt();
		
		System.out.println("1 --> Addition ");
		System.out.println("2 --> Subtraction");
		System.out.println("3 --> Multiplication");
		System.out.println("4 --> Division");
		
		System.out.print("Enter your Choice : ");
		input = sc.nextInt();
		switch(input){
			case 1: System.out.print("Addition : " + (int)(number1+number2));
					break;
			case 2: System.out.print("Subtraction : "+ (int)(number1-number2));
					break;
			case 3: System.out.print("Multiplication : "+ (int)(number1 * number2));
					break;
			case 4: System.out.print("Divison : "+(float)(number1/number2));
					break;
			default : System.out.print("Invalide choice");
	
		}//end of switch
        sc.close();
	}
}