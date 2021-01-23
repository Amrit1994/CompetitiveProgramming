package com.gencode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DayOfTheWeek {

	public String dayOfTheWeek(int day, int month, int year) {

		Map<String, Integer> dayMap = new HashMap<>();
		Map<Integer, Integer> monthMap = new HashMap<>();
		Map<Integer, Integer> yearMap = new HashMap<>();

		dayMap.put("Sunday", 0);
		dayMap.put("Monday", 1);
		dayMap.put("Tuesday", 2);
		dayMap.put("Wednesday", 3);
		dayMap.put("Thursday", 4);
		dayMap.put("Friday", 5);
		dayMap.put("Saturday", 6);

		yearMap.put(1500, 0);
		yearMap.put(1600, 6);
		yearMap.put(1700, 4);
		yearMap.put(1800, 2);

		monthMap.put(1, 0);
		monthMap.put(2, 3);
		monthMap.put(3, 3);
		monthMap.put(4, 6);
		monthMap.put(5, 1);
		monthMap.put(6, 4);
		monthMap.put(7, 6);
		monthMap.put(8, 2);
		monthMap.put(9, 5);
		monthMap.put(10, 0);
		monthMap.put(11, 3);
		monthMap.put(12, 5);

		int changedYear = year / 100 * 100;
		int sum = 0;
		int lastDigitOfYear = year % 10;

		Set<Entry<Integer, Integer>> yearSet = yearMap.entrySet();
		p: for (Entry<Integer, Integer> itr : yearSet) {

			System.out.println(itr.getKey() + "====" + changedYear);
			int diff = changedYear - itr.getKey();
			System.out.println("diff == "+ diff);
			if (diff == 0) {
				sum = day + monthMap.get(month) + lastDigitOfYear + lastDigitOfYear / 4 + yearMap.get(itr.getKey());
//        		   if(changedYear%4==0 && changedYear%100 == 0 && changedYear%400 == 0){
//                        sum = sum-1;
//                    }
				break;
			} else if (diff == 400 && diff % 400 == 0) {
				System.out.println("inside else if");
				sum = day + monthMap.get(month) + lastDigitOfYear + lastDigitOfYear / 4 + yearMap.get(itr.getKey());
//	        		   if(changedYear%4==0 && changedYear%100 == 0 && changedYear%400 == 0){
//	                        sum = sum-1;
//	                    }
				break;
			} else {
				continue p;
			}
		}

		System.out.println(sum);
		int dayQuotient = sum / 7;
		String getDay = "";
		Set<Entry<String, Integer>> daySet = dayMap.entrySet();
		out: for (Entry<String, Integer> str : daySet) {

			if (str.getValue().equals(dayQuotient)) {
				System.out.println("==" + dayQuotient);
				System.out.println("==" + str.getKey());
				getDay = str.getKey();
				break;
			} else {
				continue out;
			}
		}
		return getDay;
	}

	public static void main(String[] args) {
		DayOfTheWeek ofTheWeek = new DayOfTheWeek();
		System.out.println(ofTheWeek.dayOfTheWeek(2, 10, 1869));
	}
}
