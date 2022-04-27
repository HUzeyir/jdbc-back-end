/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.mycompany.bean;

import java.util.List;

/**
 *
 * @author user
 */
public class Address {
    
    private Short addressId;
    private String city;
    private String town;
    private String street;
    private List<User> users;
   

    public Address() {
    }

    public Address(String city, String town, String street) {
        this.city = city;
        this.town = town;
        this.street = street;
    }

    public Address(Short addressId, String city, String town, String street) {
        this.addressId = addressId;
        this.city = city;
        this.town = town;
        this.street = street;
    }
    
    

    
    public Address(Short addressId, String city, String town, String street, List<User> users) {
        this.addressId = addressId;
        this.city = city;
        this.town = town;
        this.street = street;
        this.users = users;
    }

    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Address{" + "addressId=" + addressId + ", city=" + city + ", town=" + town + ", street=" + street + ", users=" + users + '}';
    }
    
    
    
    
}
