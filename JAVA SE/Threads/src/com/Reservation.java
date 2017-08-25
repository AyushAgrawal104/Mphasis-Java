package com;

class Operator implements Runnable {

	private int noOfSeats = 2;
	private int wanted;

	public Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {

		String tname = Thread.currentThread().getName();

		synchronized (this) { // block
			System.out.println("Number of seats available: " + noOfSeats);
			System.out.println("Trying to Book " + wanted + " Seats to " + tname);

			if (wanted <= noOfSeats) {

				noOfSeats = noOfSeats - wanted;
				System.out.println(wanted + " Seats Booked for " + tname);

			} else {
				System.out.println("No Seats Booked for  " + tname);
			}
		} // end of sync

	}

}

public class Reservation {

	public static void main(String[] args) {

		Operator operator = new Operator(2);

		Thread p1 = new Thread(operator);
		Thread p2 = new Thread(operator);

		p1.setName("Passenger-1");
		p2.setName("Passenger-2");

		p1.start();
		p2.start();

	}

}
