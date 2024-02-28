package com.example.vehicle_search2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="manufacture_year")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufactureYear {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="year")
    private int year;


}
