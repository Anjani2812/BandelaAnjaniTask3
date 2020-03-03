package epamcom.designprinciples;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {

    	double n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n1:");

        
        n1 = scanner.nextDouble();
        System.out.print("Enter n2:");
        n2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;

        switch(operator){
            case '+':
            	result = n1 + n2;
                break;

            case '-':
            	result = n1 - n2;
                break;

            case '*':
            	result = n1 * n2;
                break;

            case '/':
            	result = n1 / n2;
                break;

            
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(result);
    }
}


