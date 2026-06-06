package com.smartQ.smartQ.repository;



import com.smartQ.smartQ.entity.QueueEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueueEntryRepository extends JpaRepository<QueueEntry, Integer> {

    List<QueueEntry> findByStatus(String status);
}
