package com.aakash.project.rentIt.service;

import com.aakash.project.rentIt.dto.BookingDto;
import com.aakash.project.rentIt.dto.BookingRequest;
import com.aakash.project.rentIt.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
