package com.smartQ.smartQ.repository;
import com.smartQ.smartQ.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}