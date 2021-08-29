package com.project.realestateserch.repository;

import com.project.realestateserch.model.RealEstateDto;

import java.util.Set;

public interface Storage {

    void save(RealEstateDto dto);

    void update(RealEstateDto dto);

    Set<RealEstateDto> findAll();
}
