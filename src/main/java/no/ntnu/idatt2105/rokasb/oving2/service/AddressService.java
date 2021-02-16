package no.ntnu.idatt2105.rokasb.oving2.service;

import no.ntnu.idatt2105.rokasb.oving2.dao.AddressDao;
import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressDao addressDao;

    public List<Address> getAddresses() { return addressDao.getAddresses(); }

    public Address getAddress(int addressID) {
        return addressDao.getAddress(addressID);
    }

    public Address addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    public Address updateAddress(int addressID, Address address) {
        return addressDao.updateAddress(addressID, address);
    }

    public Address removeAddress(int addressID) { return addressDao.removeAddress(addressID); }
}
