package com.project.realestateserch.repository;

import com.project.realestateserch.model.RealEstate;
import com.project.realestateserch.model.RealEstateAddress;
import com.project.realestateserch.repository.rowmapper.RealEstateRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository
public class StorageImpl implements Storage {
    private final JdbcTemplate jdbcTemplate;

    public StorageImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveRealEstate(List<RealEstate> realEstates) {
        String sql = buildRealEstateSQLStringInsert(realEstates);
        jdbcTemplate.update(sql);
    }

    @Override
    public List<RealEstate> getAll() {
        String sql = "SELECT type, country, district, city, street, address_number, number_of_rooms, area, price, floor FROM real_estate";
        return jdbcTemplate.query(sql, new RealEstateRowMapper());
    }

    @Override
    public Integer getCount() {
        String sql = "SELECT count(id) FROM real_estate;";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    private String buildRealEstateSQLStringInsert(List<RealEstate> realEstates) {

        Iterator<RealEstate> iterator = realEstates.iterator();
        StringBuilder sqlRealEstate = new StringBuilder("INSERT INTO real_estate (type, country, district, city, street, address_number, number_of_rooms, area, price, floor) VALUES ");

        while (iterator.hasNext()) {
            RealEstate next = iterator.next();
            RealEstateAddress address = next.getAddress();

            sqlRealEstate.append("('")
                    .append(next.getType()).append("', '")
                    .append(address.getCountry()).append("', '")
                    .append(address.getDistrict()).append("', '")
                    .append(address.getCity()).append("', '")
                    .append(address.getStreet()).append("', ")
                    .append(address.getNumber()).append(", ")
                    .append(next.getNumberOfRooms()).append(", ")
                    .append(next.getArea()).append(", ")
                    .append(next.getPrice()).append(", ")
                    .append(next.getFloor());

            if (iterator.hasNext()) {
                sqlRealEstate.append("), ");
            } else {
                sqlRealEstate.append(")");
            }
        }
        return sqlRealEstate.toString();
    }
}
