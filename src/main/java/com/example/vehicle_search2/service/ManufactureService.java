package com.example.vehicle_search2.service;

import com.example.vehicle_search2.entity.Manufacture;

import java.util.List;

public interface ManufactureService {

    public Manufacture save(Manufacture manufacture);

    public List<Manufacture> getManufactures();
}
