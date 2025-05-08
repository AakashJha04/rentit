package com.aakash.project.rentIt.service;

import com.aakash.project.rentIt.dto.HotelDto;
import com.aakash.project.rentIt.dto.HotelSearchRequest;
import com.aakash.project.rentIt.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
