package com.project.realestateserch.controller;

import com.project.realestateserch.service.CriteriaDTO;
import com.project.realestateserch.service.ServiceApp;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/advertisement")
public class ControllerApp {

    private final ServiceApp serviceApp;

    public ControllerApp(ServiceApp serviceApp) {
        this.serviceApp = serviceApp;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<CriteriaDTO> viewAdvertisement(@RequestParam("address") String address,
                                                         @Param("rooms") Integer numberOfRooms,
                                                         @Param("square") Integer square,
                                                         @Param("price") Integer price,
                                                         @Param("floor") Integer floor) {

        CriteriaDTO criteriaDTO = new CriteriaDTO(address, numberOfRooms, square, price, floor);

        serviceApp.getAdvertisements(criteriaDTO);

        return null;
    }
}