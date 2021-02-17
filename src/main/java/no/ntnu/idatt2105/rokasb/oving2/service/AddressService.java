package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.dao.AddressDao;
import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressDao addressDao;

    private final Logger LOGGER = LoggerFactory.getLogger(AddressService.class);

    public List<Address> getAddresses() {
        LOGGER.info("AddressService.getAddresses() was called.");
        return addressDao.getAddresses();
    }

    public Address getAddress(int addressID) {
        Address address = addressDao.getAddress(addressID);
        if(address != null) LOGGER.info("AddressService.getAddress() was called and returned: " + address);
        else LOGGER.warn("AddressService.getAddress() was called and returned null. No address with such addressID found.");
        return address;
    }

    public Address addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    public Address updateAddress(int addressID, Address address) {
        return addressDao.updateAddress(addressID, address);
    }

    public Address removeAddress(int addressID) { return addressDao.removeAddress(addressID); }
}
