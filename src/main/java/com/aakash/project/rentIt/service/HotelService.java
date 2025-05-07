package com.aakash.project.rentIt.service;

import com.aakash.project.rentIt.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
}
