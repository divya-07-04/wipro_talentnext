package java_fundamentals;

import java.util.*;
 
public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		int reverse=0;
	    while(num!=0) {
		 int digit=num%10;
		 reverse=reverse*10+digit;
		 num=num/10;
	    }
	System.out.println("Reversed number" + reverse);
    
	sc.close();
   }
 
}
