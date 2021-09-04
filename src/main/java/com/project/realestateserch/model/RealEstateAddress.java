package com.project.realestateserch.model;


import java.util.Objects;

public class RealEstateAddress {
    private String country;
    private String district;
    private String city;
    private String street;
    private Integer number;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstateAddress that = (RealEstateAddress) o;
        return Objects.equals(country, that.country) && Objects.equals(district, that.district) && Objects.equals(city, that.city) && Objects.equals(street, that.street) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, district, city, street, number);
    }
}
