package java_fundamentals;


import java.util.*;

public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		for(int i=num;i!=0;i=i/10) {
			int digit=i%10;
			sum+=digit;
		}
		System.out.println("Sum of digits" + sum);

		sc.close();
	}
}
