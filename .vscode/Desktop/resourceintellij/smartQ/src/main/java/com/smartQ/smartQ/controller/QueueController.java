package com.smartQ.smartQ.controller;



import com.smartQ.smartQ.entity.QueueEntry;
import com.smartQ.smartQ.service.QueueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/queues")
public class QueueController {

    private final QueueService queueService;

    public QueueController(QueueService queueService) {
        this.queueService = queueService;
    }

    @PostMapping
    public QueueEntry createQueue(@RequestBody QueueEntry queueEntry) {
        return queueService.saveQueue(queueEntry);
    }

    @GetMapping
    public List<QueueEntry> getAllQueues() {
        return queueService.getAllQueues();
    }

    @GetMapping("/{id}")
    public Optional<QueueEntry> getQueueById(@PathVariable Integer id) {
        return queueService.getQueueById(id);
    }

    @GetMapping("/waiting")
    public List<QueueEntry> getWaitingQueues() {
        return queueService.getWaitingQueues();
    }

    @DeleteMapping("/{id}")
    public String deleteQueue(@PathVariable Integer id) {
        queueService.deleteQueue(id);
        return "Queue Deleted Successfully";
    }
}
