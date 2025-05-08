package com.aakash.project.rentIt.repository;

import com.aakash.project.rentIt.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
