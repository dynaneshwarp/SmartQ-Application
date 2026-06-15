package com.smartQ.smartQ.sericeImpl;
import com.smartQ.smartQ.entity.Slot;
import com.smartQ.smartQ.repository.SlotRepository;
import com.smartQ.smartQ.service.SlotService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class SlotServiceImpl implements SlotService {

    private final SlotRepository slotRepository;

    public SlotServiceImpl(SlotRepository slotRepository) {
        this.slotRepository = slotRepository;
    }

    @Override
    public Slot saveSlot(Slot slot) {
        return slotRepository.save(slot);
    }

    @Override
    public List<Slot> getAllSlots() {
        return slotRepository.findAll();
    }

    @Override
    public List<Slot> getAvailableSlots() {
        return slotRepository.findByStatus("AVAILABLE");
    }

    @Override
    public List<Slot> getSlotsByShop(Integer shopId) {
        return slotRepository.findByShopId(shopId);
    }

    @Override
    public Optional<Slot> getSlotById(Integer id) {
        return slotRepository.findById(id);
    }

    @Override
    public void deleteSlot(Integer id) {
        slotRepository.deleteById(id);
    }

}
