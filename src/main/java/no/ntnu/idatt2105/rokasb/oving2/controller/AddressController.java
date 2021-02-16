package no.ntnu.idatt2105.rokasb.oving2.controller;

import no.ntnu.idatt2105.rokasb.oving2.object.Address;
import no.ntnu.idatt2105.rokasb.oving2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public List<Address> getAddresses() { return addressService.getAddresses(); }

    @PostMapping("/addresses")
    public void addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
    }

    @GetMapping("/addresses/{addressID}")
    public Address getAddress(@PathVariable("addressID") int addressID) {
        return addressService.getAddress(addressID);
    }

    @PutMapping("/addresses/{addressID}")
    public void updateAddress(@PathVariable("addressID") int addressID, @RequestBody Address address) {
        addressService.updateAddress(addressID, address);
    }

    @DeleteMapping("/addresses/{addressID}")
    public void removeAddress(@PathVariable("addressID") int addressID) {
        addressService.removeAddress(addressID);
    }
}
