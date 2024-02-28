package com.example.vehicle_search2.dao;

import com.example.vehicle_search2.entity.ManufactureYear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ManufactureYearDAO extends JpaRepository<ManufactureYear,Integer> {



}
