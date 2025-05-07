package com.aakash.project.rentIt.service;

import com.aakash.project.rentIt.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
