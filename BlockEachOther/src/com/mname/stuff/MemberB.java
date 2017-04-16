package com.mname.stuff;

public class MemberB {
	synchronized void bar(MemberA a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " вошел в метод MemberB.bar()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Класс MemberB прерван");
		}

		System.out.println(name + " пытается вызвать метод MemberA.last()");
		a.last();
	}

	synchronized void last() {
		System.out.println(" В методе MemberA.last()");
	}
}
