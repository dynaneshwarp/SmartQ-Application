package com.smartQ.smartQ.repository;

import com.smartQ.smartQ.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Integer> {

    List<Slot> findByStatus(String status);

    List<Slot> findByShopId(Integer shopId);
}