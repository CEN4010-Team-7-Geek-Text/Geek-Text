package com.example.site.User;

public class UserDto {

    /**************************************************************************
     * CLASS VARIABLES
     *************************************************************************/


    private Integer userId;

    private String email;

    private String fname;

    private String lname;

    private String password;

    private String address;

    private String phone;

    /**************************************************************************
     * GETTERS / SETTERS
     *************************************************************************/

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }

    public void setLname(String lname) { this.lname = lname; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

}