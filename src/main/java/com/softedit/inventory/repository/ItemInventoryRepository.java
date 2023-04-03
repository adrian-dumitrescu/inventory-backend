package com.softedit.inventory.repository;

import com.softedit.inventory.model.ItemInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface ItemInventoryRepository extends JpaRepository<ItemInventory, Long> {
}
