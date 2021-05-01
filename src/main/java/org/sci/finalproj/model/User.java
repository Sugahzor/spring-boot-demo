package org.sci.finalproj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class User {
    private String userEmail;
    private String userName;
    private String userPassword;
    private Long userPhone;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    public User() {
    }

    public User(String userEmail, String userName, String userPassword, Long userPhone) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getUserPhone() { return userPhone; }

    public void setUserPhone(Long userPhone) { this.userPhone = userPhone; }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
