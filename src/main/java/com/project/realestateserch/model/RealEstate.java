package com.project.realestateserch.model;

import java.util.Objects;

public class RealEstate {
    private RealEstateType type;
    private Integer floor;
    private Integer area;
    private Integer numberOfRooms;
    private RealEstateAddress address;
    private Integer price;

    public RealEstateType getType() {
        return type;
    }

    public void setType(RealEstateType type) {
        this.type = type;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public RealEstateAddress getAddress() {
        return address;
    }

    public void setAddress(RealEstateAddress address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealEstate)) return false;
        RealEstate that = (RealEstate) o;
        return type == that.type && Objects.equals(floor, that.floor) && Objects.equals(area, that.area) && Objects.equals(numberOfRooms, that.numberOfRooms) && Objects.equals(address, that.address) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, floor, area, numberOfRooms, address, price);
    }
}