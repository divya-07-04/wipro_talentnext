package java_fundamentals;
import java.util.*;
public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		

	
	if(num>0) {
		System.out.println("positive");
	}
	else if(num<0) {
		System.out.println("negative");
	}
	else {
		System.out.println("zero");
	}
 sc.close();
}
}
