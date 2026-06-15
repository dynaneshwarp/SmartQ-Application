package com.smartQ.smartQ.service;



import com.smartQ.smartQ.entity.Vendor;

import java.util.List;
import java.util.Optional;

public interface VendorService {

    Vendor saveVendor(Vendor vendor);

    List<Vendor> getAllVendors();

    Optional<Vendor> getVendorById(Integer id);

    void deleteVendor(Integer id);
}