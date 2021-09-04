package com.project.realestateserch.repository;

import com.project.realestateserch.model.RealEstate;

import java.util.List;

public interface Storage {

    void saveRealEstate(List<RealEstate> realEstates);

    List<RealEstate> getAll();

    Integer getCount();
}
