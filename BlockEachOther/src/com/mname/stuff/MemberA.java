package com.mname.stuff;

public class MemberA {

	synchronized void foo(MemberB b) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " вошел в метод MemberA.foo()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Класс А прерван");
		}

		System.out.println(name + " пытается вызвать метод MemberВ.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("В методе А.last()");
	}

}
