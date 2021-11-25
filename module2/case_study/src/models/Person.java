package models;

public abstract class Person {
    private String name;
    private String birthday;
    private boolean sex;
    private String CMND;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String birthday, boolean sex, String CMND, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    abstract public String toString();
    abstract public String getInforToCSV();
}
