package no.ntnu.idatt2105.rokasb.oving2.dao;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Address> getAddresses() {
        String query = "SELECT * FROM address";
        return null;

    }

    public Address getAddress(int addressID) {
        return null;
    }

    public int addAddress(Address address) {
        return jdbcTemplate.update("INSERT INTO address(street_name, street_mr) VALUES (?, ?)",
                address.getStreetName(), address.getStreetNr());
    }

    public int updateAddress(int addressID, Address address) {
        return jdbcTemplate.update("UPDATE address SET street_name = ?, street_nr = ? WHERE address_id = ?",
                address.getStreetName(), address.getStreetNr(), addressID);
    }

    public int removeAddress(int addressID) {
        return jdbcTemplate.update("DELETE FROM address WHERE address_id = ?", addressID);
    }
}
