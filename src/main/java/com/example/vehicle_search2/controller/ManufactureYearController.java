package com.example.vehicle_search2.controller;

import com.example.vehicle_search2.entity.ManufactureYear;
import com.example.vehicle_search2.service.ManufactureYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManufactureYearController {

    @Autowired
    private ManufactureYearService manufactureYearService;

    @PostMapping("/saveyear")
    public ManufactureYear save(@RequestBody ManufactureYear manufactureYear)
    {
        return manufactureYearService.saveYear(manufactureYear);
    }

}
