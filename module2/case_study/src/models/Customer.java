package models;

import java.text.SimpleDateFormat;

public class Customer extends Person{
    private String customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String birthday, boolean sex, String CMND, String phoneNumber, String email, String customerCode, String customerType, String address) {
        super(name, birthday, sex, CMND, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", birthday=" + getBirthday() + '\'' +
                ", sex=" + isSex() + '\'' +
                ", CMND='" + getCMND() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getInforToCSV() {
        return getName() +"," + getBirthday() +"," + isSex() + "," + getCMND() +"," + getPhoneNumber() +
                "," + getEmail() + "," + customerCode + "," + customerType + "," + address;
    }
}
