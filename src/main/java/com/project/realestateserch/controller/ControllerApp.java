package com.project.realestateserch.controller;

import com.project.realestateserch.model.RealEstate;
import com.project.realestateserch.service.RealEstateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping()
public class ControllerApp {

    private final RealEstateService service;

    public ControllerApp(RealEstateService service) {
        this.service = service;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RealEstate>> viewAdvertisement() {
    return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}