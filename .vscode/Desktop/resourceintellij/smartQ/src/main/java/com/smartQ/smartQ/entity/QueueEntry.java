package com.smartQ.smartQ.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "queue_entries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueueEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer tokenNumber;

    private Integer queuePosition;

    private String status;

    // Relationships

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
}