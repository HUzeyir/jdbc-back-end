/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.mycompany.bean;

/**
 *
 * @author HuzeyirPc
 */
public class UserSkill {
    
    private int skill_id;
    private int power;

    public UserSkill() {
    }

    public UserSkill(int skill_id, int power) {
        this.skill_id = skill_id;
        this.power = power;
    }

    public UserSkill(int power) {
        this.power = power;
    }
    
    

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "UserSkill{" + "skill_id=" + skill_id + ", power=" + power + '}';
    }

    
}
