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
public class PrivateInformation {
    
    private int piId;
    private List<String> phones;
    private List<String> links;
    private User user;

    public PrivateInformation() {
    }

    public PrivateInformation(List<String> phones, List<String> links) {
        this.phones = phones;
        this.links = links;
    }

    public int getPiId() {
        return piId;
    }

    public void setPiId(int piId) {
        this.piId = piId;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PrivateInformation{" + "piId=" + piId + ", phones=" + phones + ", links=" + links + ", user=" + user + '}';
    }
    
    
    
    
}
