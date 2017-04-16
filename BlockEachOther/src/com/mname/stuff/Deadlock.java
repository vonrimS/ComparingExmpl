package com.mname.stuff;

public class Deadlock implements Runnable {

	MemberA a = new MemberA();
	MemberB b = new MemberB();

	public Deadlock() {
		Thread.currentThread().setName("Главный поток");
		Thread t = new Thread(this, "Поток-соперник");
		t.start();

		a.foo(b);
		System.out.println("Назад в главный поток");
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("Назад в другой поток");

	}

	public static void main(String[] args) {
		new Deadlock();
	}

}
