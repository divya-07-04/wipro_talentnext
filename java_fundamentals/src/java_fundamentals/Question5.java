package java_fundamentals;

import java.util.*;
	
public class Question5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first non negative number");
		int num1 = sc.nextInt();
		System.out.print("Enter second non negative number");
		int num2 = sc.nextInt();
		boolean result=(num1%10)==(num2%10);
		System.out.println("last digit " + " ( " + num1 + " , " +num2 + " ) " + " is " + result);
        
		sc.close();
	}

}
