package no.ntnu.idatt2105.rokasb.oving2.object;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {
    private int addressID;
    private String streetName;
    private int streetNr;

    @JsonIgnore
    private Author author;

    public Address(String streetName, int streetNr) {
        this.streetName = streetName;
        this.streetNr = streetNr;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(int streetNr) {
        this.streetNr = streetNr;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", streetName='" + streetName + '\'' +
                ", streetNr=" + streetNr +
                '}';
    }
}
