package com.example.vehicle_search2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="manufacture")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacture {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="manufacturer_name")
    private String manufacturName;

    @Column(name="country")
    private String country;


}
