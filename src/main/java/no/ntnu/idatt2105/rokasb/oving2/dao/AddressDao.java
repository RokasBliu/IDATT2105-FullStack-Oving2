package no.ntnu.idatt2105.rokasb.oving2.dao;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressDao {
    private List<Address> addresses;

    public AddressDao() {
        addresses = new ArrayList<>();
    }

    public AddressDao(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Address getAddress(int addressID) {
        for(Address address : addresses) {
            if(address.getAddressID() == addressID) return address;
        }
        return null;
    }

    public Address addAddress(Address address) {
        address.setAddressID(addresses.size() + 1);
        addresses.add(address);
        return address;
    }

    public Address updateAddress(int addressID, Address address) {
        int i;
        for(i = 0; i < addresses.size(); i++) {
            if(addresses.get(i).getAddressID() == addressID) {
                address.setAddressID(addressID);
                break;
            }
        }
        addresses.set(i, address);
        return address;
    }

    public Address removeAddress(int addressID) {
        for(Address address : addresses) {
            if(address.getAddressID() == addressID) {
                addresses.remove(address);
                return address;
            }
        }
        return null;
    }
}
