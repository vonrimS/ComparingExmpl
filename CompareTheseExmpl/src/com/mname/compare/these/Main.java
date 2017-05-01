package com.mname.compare.these;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		new CompareThese();

		TreeMap<String, Double> tm = new TreeMap<String, Double>((String o1, String o2) -> o1.compareTo(o2));

		tm.put("Алексей Иванов", new Double(1000.10));
		tm.put("Григорий Иванов", new Double(1890.19));
		tm.put("Инвар Гайдар", new Double(99000.10));
		tm.put("Савелий Брюлов", new Double(101.11));
		tm.put("Карл Фарел", new Double(1000.10));
		tm.put("Гарик Мартиросян", new Double(1660.10));
		tm.put("Джон Кеннеди", new Double(19990.99));

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
