package com.mocha.springbootwar.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("employee")
public class Employee {

    private Integer id;

    @TableField("lastName")
    private String lastName;

    private String email;

    private Integer gender;

    private String dId;

    /**
     * id.
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id.
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * lastName.
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * lastName.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * email.
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * email.
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gender.
     * @return the gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * gender.
     * @param gender the gender to set
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * dId.
     * @return the dId
     */
    public String getdId() {
        return dId;
    }

    /**
     * dId.
     * @param dId the dId to set
     */
    public void setdId(String dId) {
        this.dId = dId;
    }
    
    
    
}
