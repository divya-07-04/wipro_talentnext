package collections;

import java.util.*;

public class MonthListUsingVector {

	public static void main(String[] args) {
		Vector<String> months = new Vector<>();

        
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

        
        System.out.println("Months of the year (using Vector):");
        for (String month : months) {
            System.out.println(month);
        }
    }


	}
