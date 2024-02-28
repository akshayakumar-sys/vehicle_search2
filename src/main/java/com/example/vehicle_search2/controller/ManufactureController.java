package com.example.vehicle_search2.controller;

import com.example.vehicle_search2.entity.Manufacture;
import com.example.vehicle_search2.entity.ManufactureYear;
import com.example.vehicle_search2.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufactureController {

    @Autowired
   private ManufactureService manufactureService;

    @PostMapping("/save")

    public Manufacture save(@RequestBody Manufacture manufacture)
    {
        return manufactureService.save(manufacture);
    }


    @GetMapping("/get")
    public ResponseEntity<List<Manufacture>> getmanufactures()
    {
        List<Manufacture> manufactures=manufactureService.getManufactures();
        return new ResponseEntity<>(manufactures, HttpStatus.OK);
    }


}
