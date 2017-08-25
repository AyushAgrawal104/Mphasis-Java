package com;

public class Test extends Thread {

	public void run() {
		
		f1();
		//f2();

	}

	void f1() {
		String tname=Thread.currentThread().getName();
	
		if(tname.equals("First")) {
			
			try {
				System.out.println(tname+" is Sleeping for 5 secs");
				Thread.sleep(5000);
				System.out.println(tname+" Resumed from the sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("I = " + i + " By " + tname);
		}
	}

	/*void f2() {
		for (int j = 1; j <= 10; j++) {
			System.out.println("J = " + j + " By " + Thread.currentThread().getName());
		}
	}*/

	public static void main(String[] args) {

		Test t = new Test();

		Thread t1 = new Thread(t);

		t1.setName("First");
		t1.setPriority(MAX_PRIORITY);

		Thread t2 = new Thread(t);
		t2.setName("Second");

		t1.start();
		// System.out.println("----- Hello "+" By "+Thread.currentThread().getName());
		 t2.start();

	}
}
