package com.project.realestateserch.model;

public class RealEstateDto {
    private RealEstateType realEstateType;
    private RealEstateGeographicalParam geographicalParam;
    private RealEstatePhysicalParam physicalParam;
    private RealEstateFinanceParam financeParam;

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public RealEstateGeographicalParam getGeographicalParam() {
        return geographicalParam;
    }

    public void setGeographicalParam(RealEstateGeographicalParam geographicalParam) {
        this.geographicalParam = geographicalParam;
    }

    public RealEstatePhysicalParam getPhysicalParam() {
        return physicalParam;
    }

    public void setPhysicalParam(RealEstatePhysicalParam physicalParam) {
        this.physicalParam = physicalParam;
    }

    public RealEstateFinanceParam getFinanceParam() {
        return financeParam;
    }

    public void setFinanceParam(RealEstateFinanceParam financeParam) {
        this.financeParam = financeParam;
    }
}
