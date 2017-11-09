package com.harsh.cms.model;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String uniqueID;
    private String userID;
    private String email;
    private String phone;
    private LocalDate dob;
    private String facebook;
    private String google;
    private String nickName;

    public User(String firstName, String lastName, String uniqueID,
                String userID, String email, String phone, LocalDate dob,
                String facebook, String google, String nickName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueID = uniqueID;
        this.userID = userID;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.facebook = facebook;
        this.google = google;
        this.nickName = nickName;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", uniqueID='" + uniqueID + '\'' +
                ", userID='" + userID + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                ", facebook='" + facebook + '\'' +
                ", google='" + google + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
