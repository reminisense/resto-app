package com.reminisense.ra.dto.json;


/**
 * Created by caspe on 7/12/2016.
 */
public class LoginResultDto {


    private int userId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String authenticationToken;
    private String roles;

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {return address;    }

    public void setAddress(String address) {
        this.address =  address;
    }

    public String getPhone() {return phone;    }

    public void setPhone(String phone) {
        this.phone =  phone;
    }

    public String getEmail() {return email;    }

    public void setEmail(String email) {
        this.email =  email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

}
