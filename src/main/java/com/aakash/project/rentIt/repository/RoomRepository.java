package com.aakash.project.rentIt.repository;

import com.aakash.project.rentIt.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
