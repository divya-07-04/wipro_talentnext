package collections;
import java.util.*;

public class MonthListUsingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> months = new LinkedList<>();

        
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");


        System.out.println("Months of the year (using LinkedList):");
        for (String month : months) {
            System.out.println(month);
        }
    }

	}