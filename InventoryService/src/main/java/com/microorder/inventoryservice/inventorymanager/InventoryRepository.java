package com.microorder.inventoryservice.inventorymanager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long>
{

}
