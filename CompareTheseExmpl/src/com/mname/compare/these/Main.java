package com.mname.compare.these;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		CompareThem compareThem = (String a, String b) -> {
			int i = a.lastIndexOf(' ');
			int j = b.lastIndexOf(' ');
			return a.substring(i).compareToIgnoreCase(b.substring(j));
		};

		CompareThem compareThemFirst = (String a, String b) -> {
			return a.compareToIgnoreCase(b);
		};

		Comparator<String> compareThen = compareThem.thenComparing(compareThemFirst);

		TreeMap<String, Double> tm = new TreeMap<String, Double>(compareThen);

		tm.put("Алексей Иванов", new Double(1000.10));
		tm.put("Григорий Иванов", new Double(1890.19));
		tm.put("Инвар Aйдар", new Double(900.10));
		tm.put("Савелий Брюлов", new Double(101.11));
		tm.put("Карл Фарел", new Double(1000.10));
		tm.put("Гри Иванов", new Double(8890.19));
		tm.put("Гарик Мартиросян", new Double(1660.10));
		tm.put("Джон Кеннеди", new Double(19990.99));
		tm.put("Гиви Гиви", new Double(20002.99));
		tm.put("Савелий Сеюлов", new Double(101.11));
		tm.put("Карл Каррел", new Double(1000.10));

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		System.out.println();

		double balance = tm.get("Савелий Брюлов");
		tm.put("Савелий Брюлов", balance + 1099);

		System.out.println("Новый остаток на счете гн. Брюлова: " + tm.get("Савелий Брюлов"));

	}
}
