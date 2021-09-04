package com.project.realestateserch.repository.rowmapper;

import com.project.realestateserch.model.RealEstate;
import com.project.realestateserch.model.RealEstateAddress;
import com.project.realestateserch.model.RealEstateType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RealEstateRowMapper implements RowMapper<RealEstate> {
    @Override
    public RealEstate mapRow(ResultSet rs, int rowNum) throws SQLException {
        RealEstate realEstate = new RealEstate();
        realEstate.setType(RealEstateType.valueOf(rs.getString("type")));

        RealEstateAddress realEstateAddress = new RealEstateAddress();
        realEstateAddress.setCountry(rs.getString("country"));
        realEstateAddress.setDistrict(rs.getString("district"));
        realEstateAddress.setCity(rs.getString("city"));
        realEstateAddress.setStreet(rs.getString("street"));
        realEstateAddress.setNumber(rs.getInt("address_number"));

        realEstate.setAddress(realEstateAddress);
        realEstate.setNumberOfRooms(rs.getInt("number_of_rooms"));
        realEstate.setArea(rs.getInt("area"));
        realEstate.setPrice(rs.getInt("price"));
        realEstate.setFloor(rs.getInt("floor"));

        return realEstate;
    }
}
