package arrays;
import java.util.*;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new int[n];
		int index = 0;
		for (int num : arr) {
			if (num != 10) {
				result[index++] = num;
			}
		}
		for (int value : result) {
			System.out.print(value + " ");
	
		}
		sc.close();
	}

}
