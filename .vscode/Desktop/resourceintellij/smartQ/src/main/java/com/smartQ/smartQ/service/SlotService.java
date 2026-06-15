package com.smartQ.smartQ.service;



import com.smartQ.smartQ.entity.Slot;

import java.util.List;
import java.util.Optional;

public interface SlotService {

    Slot saveSlot(Slot slot);

    List<Slot> getAllSlots();

    List<Slot> getAvailableSlots();

    List<Slot> getSlotsByShop(Integer shopId);

    Optional<Slot> getSlotById(Integer id);

    void deleteSlot(Integer id);
}