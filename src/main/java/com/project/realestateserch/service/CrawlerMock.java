package com.project.realestateserch.service;

import com.project.realestateserch.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrawlerMock implements Crawler {
    @Override
    public List<RealEstateDto> findRealEstateData(String url) {
        ArrayList<RealEstateDto> realEstates = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            RealEstateGeographicalParam houseOneGeographicalParam = new RealEstateGeographicalParam();
            houseOneGeographicalParam.setCountry("Україна__" + i);
            houseOneGeographicalParam.setDistrict("Черкаська__" + i);
            houseOneGeographicalParam.setCity("Черкаси__" + i);
            houseOneGeographicalParam.setStreet("Гагаріна__" + i);
            houseOneGeographicalParam.setNumber(17 + i);

            RealEstatePhysicalParam hoseOnePhysicalParam = new RealEstatePhysicalParam();
            hoseOnePhysicalParam.setFloor(10 + i);
            hoseOnePhysicalParam.setSquare(20 + i);
            hoseOnePhysicalParam.setNumberOfRooms(2 + i);

            RealEstateFinanceParam houseOneFinanceParam = new RealEstateFinanceParam();
            houseOneFinanceParam.setPrice(18000 + i);


            RealEstateDto houseOne = new RealEstateDto();
            houseOne.setRealEstateType(RealEstateType.HOUSE);
            houseOne.setGeographicalParam(houseOneGeographicalParam);
            houseOne.setPhysicalParam(hoseOnePhysicalParam);
            houseOne.setFinanceParam(houseOneFinanceParam);

            realEstates.add(houseOne);
        }

        return realEstates;
    }
}
