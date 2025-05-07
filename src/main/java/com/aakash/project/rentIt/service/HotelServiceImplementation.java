package com.aakash.project.rentIt.service;

import com.aakash.project.rentIt.dto.HotelDto;
import com.aakash.project.rentIt.entity.Hotel;
import com.aakash.project.rentIt.exception.ResourceNotFoundException;
import com.aakash.project.rentIt.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImplementation implements HotelService{

    private final HotelRepository hotelRepository;

    private final ModelMapper modelMapper;

    @Override
    public HotelDto createNewHotel(HotelDto hotelDto){
        log.info("[INFO]:\tCreating a new hotel with name:{}", hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        hotel.setActive(false);
        hotel = hotelRepository.save(hotel);
        log.info("[INFO]:\tCreated a new hotel with ID:{}", hotelDto.getId());
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("[INFO]:\tGetting the hotel by ID:{}", id);
        Hotel hotel = hotelRepository.
                findById(id).
                orElseThrow(()-> new ResourceNotFoundException("Hotel not found with ID:"+id));
        return modelMapper.map(hotel, HotelDto.class);
    }

}
