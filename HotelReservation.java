package com.bridgelaz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation

/**
 * Created a array list name as hotelsList
 */
{
	ArrayList<Hotel> List = new ArrayList<>();

	public void printWelcomeMessage() {
		System.out.println("Welcome to the Hotel Reservation Program");
	}

	/**
	 * Created a method addHotelDetails to add the hotels in the array list.
	 */

	public void addHotel() {

		List.add(new Hotel("Lakewood", 110));
		List.add(new Hotel("Bridgewood", 150));
		List.add(new Hotel("Ridgewood", 220));
	}
}
