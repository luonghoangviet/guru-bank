package model;

import io.cucumber.java.DataTableType;

import java.util.Map;

/**
 * Created by vietluong on 8/12/2018.
 */
public class NewCustomer {
    private String customerName;
    private String gender;
    private String dob;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String mobileNumber;
    private String email;
    private String password;

    public NewCustomer(String customerName, String gender, String dob, String address, String city, String state, String pin, String mobileNumber, String email, String password) {
        this.customerName = customerName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @DataTableType
//    public NewCustomer newCustomertEntry(Map<String, String> entry) {
//        return new NewCustomer(entry.get("customerName"), entry.get("gender"), entry.get("dob"), entry.get("address"), entry.get("city"), entry.get("state"), entry.get("pin"), entry.get("mobileNumber"), entry.get("email"), entry.get("password"));
//    }
}
