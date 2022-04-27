package com.mycompany.bean;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class User {

    private Integer userId;
    private String name;
    private String sur_name;
    private String email;
    private String password;
    private String about;
    private UserSkill power;
    private Date age;
    private Timestamp addDate;
    private Timestamp updateDate;
    private List<Address> adresses;                // many to many
    private Nationality nationality;               // one to many
    private PrivateInformation privateInformation; // one to one
    private List<Skill> skills;                    // many to many
    private boolean isOnline;
    private Deleted deletedTime;                   // one to one

    public User() {
    }

    public User(Integer userId, String name, String sur_name, String email, String password, String about, UserSkill power, Date age, Timestamp addDate, Timestamp updateDate, List<Address> adresses, Nationality nationality, PrivateInformation privateInformation, List<Skill> skills, boolean isOnline) {
       
        this.userId = userId; 
        this.name = name;
        this.sur_name = sur_name;
        this.email = email;
        this.password = password;
        this.about = about;
        this.power = power;
        this.age = age;
        this.addDate = addDate;
        this.updateDate = updateDate;
        this.adresses = adresses;
        this.nationality = nationality;
        this.privateInformation = privateInformation;
        this.skills = skills;
        this.isOnline = isOnline; 
    }

    public User(Integer userId, String name, String sur_name, String email, String password, String about,  Date age, Timestamp addDate, Timestamp updateDate, boolean isOnline) {
        this.userId = userId;
        this.name = name;
        this.sur_name = sur_name;
        this.email = email;
        this.password = password;
        this.about = about;
        this.age = age;
        this.addDate = addDate;
        this.updateDate = updateDate;
        this.isOnline = isOnline;
    }

  

    public User(String name, String sur_name, String email, String password, String about, Date age, Timestamp addDate, boolean isOnline) {
        this.name = name;
        this.sur_name = sur_name;
        this.email = email;
        this.password = password;
        this.about = about;
        this.age = age;
        this.addDate = addDate;
        this.isOnline = isOnline;
    }
    
    

   

  

   

  

    public Nationality getNationality() {
        return nationality;
    }

    public UserSkill getPower() {
        return power;
    }

    public void setPower(UserSkill power) {
        this.power = power;
    }

    
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public List<Address> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Address> adresses) {
        this.adresses = adresses;
    }

    public PrivateInformation getPrivateInformation() {
        return privateInformation;
    }

    public void setPrivateInformation(PrivateInformation privateInformation) {
        this.privateInformation = privateInformation;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Deleted getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Deleted deletedTime) {
        this.deletedTime = deletedTime;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name=" + name + ", sur_name=" + sur_name + ", email=" + email + ", password=" + password + ", about=" + about + ", age=" + age + ", addDate=" + addDate + ", updateDate=" + updateDate + ", adresses=" + adresses + ", nationality=" + nationality + ", privateInformation=" + privateInformation + ", skills=" + skills + ", isOnline=" + isOnline + ", deletedTime=" + deletedTime + '}';
    }

}
