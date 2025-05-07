package com.aakash.project.rentIt.repository;

import com.aakash.project.rentIt.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
