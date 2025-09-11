package com.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserDtls 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String mobileNumber;
    private String email;
    private String city;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    private String state;
    private String address;
    private String password;
   
    private String profileImage;
    public UserDtls(Integer id, String name, String mobileNumber, String email, String city, String state,
            String address, String password, String profileImage) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.city = city;
        this.state = state;
        this.address = address;
        this.password = password;
        this.profileImage = profileImage;
    }
    

    public UserDtls() {
    }

    @Override
    public String toString() {
        return "UserDtls [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
                + ", city=" + city + ", state=" + state + ", address=" + address + ", password=" + password
                + ", profileImage=" + profileImage + "]";
    }

    

}
