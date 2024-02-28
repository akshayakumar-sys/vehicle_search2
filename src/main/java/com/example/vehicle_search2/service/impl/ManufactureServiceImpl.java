package com.example.vehicle_search2.service.impl;

import com.example.vehicle_search2.dao.ManufactureDAO;
import com.example.vehicle_search2.entity.Manufacture;
import com.example.vehicle_search2.entity.ManufactureYear;
import com.example.vehicle_search2.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    @Autowired
    private ManufactureDAO manufactureDAO;

    @Override
    public Manufacture save(Manufacture manufacture)
    {
        return manufactureDAO.save(manufacture);
    }

    @Override
    public List<Manufacture> getManufactures() {
        List<Manufacture> manufactures=manufactureDAO.findAll();
        return manufactures;
    }
}
