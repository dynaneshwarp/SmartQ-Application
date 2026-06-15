package com.smartQ.smartQ.controller;



import com.smartQ.smartQ.entity.Slot;
import com.smartQ.smartQ.service.SlotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/slots")
public class SlotController {

    private final SlotService slotService;

    public SlotController(SlotService slotService) {
        this.slotService = slotService;
    }

    @PostMapping
    public Slot createSlot(@RequestBody Slot slot) {
        return slotService.saveSlot(slot);
    }

    @GetMapping
    public List<Slot> getAllSlots() {
        return slotService.getAllSlots();
    }

    @GetMapping("/{id}")
    public Optional<Slot> getSlotById(@PathVariable Integer id) {
        return slotService.getSlotById(id);
    }

    @GetMapping("/available")
    public List<Slot> getAvailableSlots() {
        return slotService.getAvailableSlots();
    }

    @GetMapping("/shop/{shopId}")
    public List<Slot> getSlotsByShop(@PathVariable Integer shopId) {
        return slotService.getSlotsByShop(shopId);
    }

    @DeleteMapping("/{id}")
    public String deleteSlot(@PathVariable Integer id) {
        slotService.deleteSlot(id);
        return "Slot Deleted Successfully";
    }
}
