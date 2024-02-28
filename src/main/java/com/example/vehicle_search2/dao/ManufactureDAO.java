package com.example.vehicle_search2.dao;

import com.example.vehicle_search2.entity.Manufacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureDAO extends JpaRepository<Manufacture, Integer> {


}
