package com.bridgelaz;
/**
 * 
 * @author Sanyukta Nirmal
 * Purpose : Hotel Reservation 
 *
 */


public class Hotel {

	private String hotelName;
	private int regularRate;

	/**
	 * Parameterized Constructor
	 * @param hotelName 
	 * @param regularRate
	 */
	public Hotel(String hotelName, int regularRate) {
		this.hotelName = hotelName;
		this.regularRate = regularRate;
	}
}
