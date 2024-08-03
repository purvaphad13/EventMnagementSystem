package com.purva.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int capacity;

    @OneToOne(mappedBy = "venue")
    private Event event;
}
