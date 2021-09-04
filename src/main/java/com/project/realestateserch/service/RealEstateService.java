package com.project.realestateserch.service;

import com.project.realestateserch.model.RealEstate;
import com.project.realestateserch.repository.StorageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RealEstateService {
    private final StorageImpl storage;
    private final CrawlerMock crawler;

    public RealEstateService(StorageImpl storage, CrawlerMock crawler) {
        this.storage = storage;
        this.crawler = crawler;
    }

    public void setRepositoryData() {
        List<RealEstate> realEstateData = crawler.getRealEstateData();

        if (realEstateData == null) {
            throw new NullPointerException();
        }

        if (storage.getCount() == 0) {
            storage.saveRealEstate(realEstateData);
            return;
        }

        if (storage.getCount() < realEstateData.size()) {
            List<RealEstate> realEstateWhatNeedAdd = findRealEstateWhatNeedAdd(realEstateData);
            storage.saveRealEstate(realEstateWhatNeedAdd);
        }
    }

    public List<RealEstate> getAll(){
       return storage.getAll();
    }

    private List<RealEstate> findRealEstateWhatNeedAdd(List<RealEstate> realEstateData) {
        List<RealEstate> allRealEstateFromStorage = storage.getAll();
        ArrayList<RealEstate> realEstates = new ArrayList<>(realEstateData);
        realEstates.removeAll(allRealEstateFromStorage);
        return realEstates;
    }
}
