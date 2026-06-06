package com.smartQ.smartQ.sericeImpl;



import com.smartQ.smartQ.entity.Vendor;
import com.smartQ.smartQ.repository.VendorRepository;
import com.smartQ.smartQ.service.VendorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public Optional<Vendor> getVendorById(Integer id) {
        return vendorRepository.findById(id);
    }

    @Override
    public void deleteVendor(Integer id) {
        vendorRepository.deleteById(id);
    }
}
