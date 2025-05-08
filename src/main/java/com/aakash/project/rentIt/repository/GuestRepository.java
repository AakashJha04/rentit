package com.aakash.project.rentIt.repository;

import com.aakash.project.rentIt.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}