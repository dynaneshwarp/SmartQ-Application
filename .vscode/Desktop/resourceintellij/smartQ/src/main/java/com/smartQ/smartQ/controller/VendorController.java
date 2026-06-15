package com.smartQ.smartQ.controller;
import com.smartQ.smartQ.entity.Vendor;
import com.smartQ.smartQ.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping("/{id}")
    public Optional<Vendor> getVendorById(@PathVariable Integer id) {
        return vendorService.getVendorById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteVendor(@PathVariable Integer id) {
        vendorService.deleteVendor(id);
        return "Vendor Deleted Successfully";
    }
}