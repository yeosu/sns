package com.ceh.sns.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserEntity {

    @Id
    private Integer id;

    @Column(name="user_name")
    private String userName;

    public Object getPassword() {

        Object object = new Object();

        return object;
    }

    public void setId(int i) {
    }

    public void setUserName(String userName) {
    }

    public void setPassword(String password) {
    }
}
