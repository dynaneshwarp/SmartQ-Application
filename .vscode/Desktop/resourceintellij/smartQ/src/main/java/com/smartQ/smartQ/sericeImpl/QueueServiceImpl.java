package com.smartQ.smartQ.sericeImpl;



import com.smartQ.smartQ.entity.QueueEntry;
import com.smartQ.smartQ.repository.QueueEntryRepository;
import com.smartQ.smartQ.service.QueueService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QueueServiceImpl implements QueueService {

    private final QueueEntryRepository queueEntryRepository;

    public QueueServiceImpl(QueueEntryRepository queueEntryRepository) {
        this.queueEntryRepository = queueEntryRepository;
    }

    @Override
    public QueueEntry saveQueue(QueueEntry queueEntry) {
        return queueEntryRepository.save(queueEntry);
    }

    @Override
    public List<QueueEntry> getAllQueues() {
        return queueEntryRepository.findAll();
    }

    @Override
    public List<QueueEntry> getWaitingQueues() {
        return queueEntryRepository.findByStatus("WAITING");
    }

    @Override
    public Optional<QueueEntry> getQueueById(Integer id) {
        return queueEntryRepository.findById(id);
    }

    @Override
    public void deleteQueue(Integer id) {
        queueEntryRepository.deleteById(id);
    }
}