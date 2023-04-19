package com.springexample.springexample.mapper;

import com.springexample.springexample.model.dto.BookingDTO;
import com.springexample.springexample.model.entity.Booking;


import java.sql.Date;

public class BookingMapper  extends AbstractMapper<Booking, BookingDTO> {




    @Override
    public Booking toEntity(BookingDTO bookingDTO) {
        Booking booking = new Booking();
        booking.setId(booking.getId());
        booking.setBookingDate(booking.getBookingDate());
        booking.setStatus(booking.getStatus());
        return null;
    }

    public BookingDTO toDto(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setId(booking.getId());
        bookingDTO.setBookingDate((Date) booking.getBookingDate());
        bookingDTO.setStatus(booking.getStatus());
        return bookingDTO;
    }
}

