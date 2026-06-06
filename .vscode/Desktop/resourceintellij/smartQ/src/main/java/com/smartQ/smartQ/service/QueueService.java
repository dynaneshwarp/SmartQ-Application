package com.smartQ.smartQ.service;



import com.smartQ.smartQ.entity.QueueEntry;

import java.util.List;
import java.util.Optional;

public interface QueueService {

    QueueEntry saveQueue(QueueEntry queueEntry);

    List<QueueEntry> getAllQueues();

    List<QueueEntry> getWaitingQueues();

    Optional<QueueEntry> getQueueById(Integer id);

    void deleteQueue(Integer id);
}
