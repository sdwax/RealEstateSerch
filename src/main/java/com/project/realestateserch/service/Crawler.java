package com.project.realestateserch.service;

import com.project.realestateserch.model.RealEstateDto;

import java.util.List;

public interface Crawler {

    public List<RealEstateDto> findRealEstateData(String url);
}
