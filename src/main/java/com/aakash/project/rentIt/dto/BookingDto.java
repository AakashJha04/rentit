package com.aakash.project.rentIt.dto;

import com.aakash.project.rentIt.entity.Hotel;
import com.aakash.project.rentIt.entity.Room;
import com.aakash.project.rentIt.entity.User;
import com.aakash.project.rentIt.entity.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
