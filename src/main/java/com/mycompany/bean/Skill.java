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
public class Skill {

    private Integer skillsId;
    private String skillsName;
    private UserSkill userSkill;
    private List<User> users;

    public Skill() {
    }

    public Skill(Integer skillsId, String skillsName, int power, List<User> users) {
        this.skillsId = skillsId;
        this.skillsName = skillsName;
        this.users = users;
    }

    public Skill(Integer skillsId, String skillsName) {
        this.skillsId = skillsId;
        this.skillsName = skillsName;
    }
    
    

    public Skill(String skillsName) {
        this.skillsName = skillsName;
    }
    
    

    public Integer getSkillsId() {
        return skillsId;
    }

    public UserSkill getUserSkill() {
        return userSkill;
    }

    public void setUserSkill(UserSkill userSkill) {
        this.userSkill = userSkill;
    }

    public void setSkillsId(Integer skillsId) {
        this.skillsId = skillsId;
    }

    public String getSkillsName() {
        return skillsName;
    }

    public void setSkillsName(String skillsName) {
        this.skillsName = skillsName;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Skills{" + "skillsId=" + skillsId + ", skillsName=" + skillsName + ", power=" + ", users=" + users + '}';
    }
    
    
    

}
