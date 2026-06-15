package com.smartQ.smartQ.service;



import com.smartQ.smartQ.entity.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

    List<Booking> getBookingsByUser(Integer userId);

    Optional<Booking> getBookingById(Integer id);

    void deleteBooking(Integer id);
}