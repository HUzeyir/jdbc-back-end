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
public class Nationality {

    private Integer nat_id;
    private String birthPlace;
    private String country;
    private List<User> users;

    public Nationality() {
    }

    public Nationality(String birthPlace, String country) {
        this.birthPlace = birthPlace;
        this.country = country;
    }

    public Nationality(Integer nat_id, String birthPlace, String country) {
        this.nat_id = nat_id;
        this.birthPlace = birthPlace;
        this.country = country;
    }
    
    

    public Nationality(Integer nat_id, String birthPlace, String country, List<User> users) {
        this.nat_id = nat_id;
        this.birthPlace = birthPlace;
        this.country = country;
        this.users = users;
    }

    public Integer getNat_id() {
        return nat_id;
    }

    public void setNat_id(Integer nat_id) {
        this.nat_id = nat_id;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Nationality{" + "nat_id=" + nat_id + ", birthPlace=" + birthPlace + ", country=" + country + ", users=" + users + '}';
    }
    
    

}
