package com.smartQ.smartQ.entity;



import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "shops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String shopName;

    private String category;

    private String address;

    // Relationships

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Slot> slots;

    @OneToMany(mappedBy = "shop")
    private List<Review> reviews;
}