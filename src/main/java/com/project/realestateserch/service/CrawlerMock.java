package com.project.realestateserch.service;

import com.project.realestateserch.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrawlerMock implements Crawler {
    @Override
    public List<RealEstate> getRealEstateData() {
        ArrayList<RealEstate> realEstates = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            RealEstateAddress houseOneGeographicalParam = new RealEstateAddress();
            houseOneGeographicalParam.setCountry("Україна__1" + i);
            houseOneGeographicalParam.setDistrict("Черкаська__" + i);
            houseOneGeographicalParam.setCity("Черкаси__" + i);
            houseOneGeographicalParam.setStreet("Гагаріна__" + i);
            houseOneGeographicalParam.setNumber(17 + i);

            RealEstate house = new RealEstate();
            house.setType(RealEstateType.HOUSE);
            house.setAddress(houseOneGeographicalParam);
            house.setFloor(10 + i);
            house.setArea(20 + i);
            house.setNumberOfRooms(2 + i);
            house.setPrice(18000 + i);

            realEstates.add(house);
        }

        return realEstates;
    }
}
