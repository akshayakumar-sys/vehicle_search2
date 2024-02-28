package com.example.vehicle_search2.service.impl;

import com.example.vehicle_search2.dao.ManufactureYearDAO;
import com.example.vehicle_search2.entity.Manufacture;
import com.example.vehicle_search2.entity.ManufactureYear;
import com.example.vehicle_search2.service.ManufactureYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufactureYearServiceImpl implements ManufactureYearService {

    @Autowired
    private ManufactureYearDAO manufactureYearDAO;

    @Override
    public ManufactureYear saveYear(ManufactureYear manufactureYear)
    {
        return manufactureYearDAO.save(manufactureYear);
    }
}
