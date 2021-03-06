package com.dao;

import java.util.List;

import com.model.Booking;
import com.model.Person;

public interface BookingDAO {
	
	public boolean newBooking(Booking booking);
	public List<Booking> getBookedDetails(int personId);
	public boolean deleteBooking(int bookingId);

}