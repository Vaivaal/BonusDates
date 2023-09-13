package Dates;

import java.time.LocalDate;

public class Main {
	public static void main (String[] args) {
		printBonusDatesBetween(2010, 2015);
	}
	
	public static void printBonusDatesBetween(int fromYear, int toYear) {
		
		LocalDate dateFrom = LocalDate.of(fromYear, 1, 1);
		LocalDate dateTo = LocalDate.of(toYear, 12, 31);
		
		for (LocalDate date = dateFrom; date.isBefore(dateTo); date = date.plusDays(1)) {
			
			String stringDate = date.toString().replaceAll("-", "");
			StringBuilder reversed = new StringBuilder();
			reversed.append(stringDate).reverse();
			if (stringDate.equals(reversed.toString())) {
				System.out.println(date);
			}
		}
		
	}
}
