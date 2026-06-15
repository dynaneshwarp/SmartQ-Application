package com.smartQ.smartQ.controller;



import com.smartQ.smartQ.entity.Booking;
import com.smartQ.smartQ.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getBookingsByUser(@PathVariable Integer userId) {
        return bookingService.getBookingsByUser(userId);
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
        return "Booking Deleted Successfully";
    }
}