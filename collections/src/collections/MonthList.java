package collections;
import java.util.*;

public class MonthList {

	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<>();

       
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

        
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);

	}

}
}